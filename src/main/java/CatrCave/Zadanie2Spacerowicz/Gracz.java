package CatrCave.Zadanie2Spacerowicz;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gracz {

    private int i;
    private int j;

    public Gracz() {
        this.i = 0;
        this.j = 0;
    }

      public void changeI(int zi) {
        this.i += zi;
    }


    public void changeJ(int zj) {
        this.j += zj;
    }


    public static boolean move(LinkedList<Character> stos, Gracz gracz){
        Scanner scn = new Scanner(System.in);
        String move = scn.nextLine().toUpperCase();

        switch (move) {
            case "P":
                gracz.changeJ(1);
                System.out.println("Twoja pozycja to " + gracz.i + " " + gracz.j);
                if (!stos.isEmpty() && stos.getLast() == 'L') {
                    stos.pop();
                } else {
                    stos.push('P');
                }
                return true;

            case "L":
                gracz.changeJ(-1);
                System.out.println("Twoja pozycja to " + gracz.i + " " + gracz.j);
                if (!stos.isEmpty() && stos.getLast() =='P') {
                    stos.pop();
                } else {
                    stos.push('L');
                }
                return true;


            case "G":
                gracz.changeI(1);
                System.out.println("Twoja pozycja to " + gracz.i + " " + gracz.j);
                if (!stos.isEmpty() && stos.getLast() =='D') {
                    stos.pop();
                } else {
                    stos.push('G');
                }
                return true;


            case "D":
                gracz.changeI(-1);
                System.out.println("Twoja pozycja to " + gracz.i + " " + gracz.j);

                if (!stos.isEmpty() && stos.getLast()=='G') {
                    stos.pop();
                } else {
                    stos.push('D');
                }
                return true;


            case "ZAKOŃCZ":
                return false;


            default:
                System.out.println("Nieprawidłowy ruch");
                return true;

        }
    }

    public static boolean checkForSurprise(Gracz gracz){

        Skarb s = new Skarb();

        if (gracz.i == 3 && gracz.j ==3) {
            System.out.println("TAK!! ZNALAZLES SKARB");
            System.out.println("Zobacz jaki SLODZIAK!!!");

            System.out.println(s.s);
            return false;

        }

        if (gracz.i == 2 && gracz.j ==2) {
            System.out.println("O NIE!!! WDEPLES W MINE!!");
            System.out.println(s.mina);
            return false;
        }

        if ((gracz.i == 1 && gracz.j ==1) || (gracz.i==1 && gracz.j==2) || (gracz.i==2 && gracz.j==1)){
            System.out.println("Uwazaj w okolicy jest mina!");
        }

        if ((gracz.i == 3 && gracz.j ==2) || (gracz.i==2 && gracz.j==3) || (gracz.i==4 && gracz.j==3)|| (gracz.i==3 && gracz.j==4)){
            System.out.println("uuuuuuuuu skarb jest blisko");
        }
        return true;
    }


}
