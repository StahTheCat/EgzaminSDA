package CatrCave.Zadanie2Spacerowicz;

import java.util.LinkedList;
import java.util.Scanner;

public class SpacerApp {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int i = 0;
        int j = 0;



        LinkedList<Character> stos = new LinkedList<>();

        System.out.println("Wybierz: \nP aby iść w prawo \n" +
                "L aby iść w lewo \n" +
                "G aby iść w górę \n" +
                "D aby iść w dół \n" +
                "wpisz: ZAKOŃCZ aby zakończyć");
        //musiałem wywalić polskie znaki bo sie nie kopliwowało w terminalu
        System.out.println();
        System.out.println("Podobno na północnym-wchodzie jest skarb...");
        System.out.println("ale uważaj na MINY!");


        boolean mina = false;

        label:
        while (true || !mina) {
            String move = scn.nextLine();
            switch (move) {
                case "P":
                    j++;
                    System.out.println("Twoja pozycja to " + i + " " + j);
                    if (!stos.isEmpty() && stos.getLast() == 'L') {
                        stos.pop();
                    } else {
                        stos.push('P');
                    }
                    break;

                case "L":
                    j--;
                    System.out.println("Twoja pozycja to " + i + " " + j);
                    if (!stos.isEmpty() && stos.getLast() =='P') {
                        stos.pop();
                    } else {
                        stos.push('L');
                    }
                    break;

                case "G":
                    i++;
                    System.out.println("Twoja pozycja to " + i + " " + j);
                    if (!stos.isEmpty() && stos.getLast() =='D') {
                        stos.pop();
                    } else {
                        stos.push('G');
                    }

                    break;

                case "D":
                    i--;
                    System.out.println("Twoja pozycja to " + i + " " + j);

                    if (!stos.isEmpty() && stos.getLast()=='G') {
                        stos.pop();
                    } else {
                        stos.push('D');
                    }

                    break;

                case "ZAKOŃCZ":
                    break label;

                default:
                    System.out.println("Nieprawidłowy ruch");
                    break;
            }
            //MINY I SKARBY!
            Skarb1 s = new Skarb1();

            if (i == 3 && j ==3) {
                System.out.println("TAK!! ZNALAZLES SKARB");
                System.out.println("Zobacz jaki SLODZIAK!!!");


                System.out.println(s.s);

                mina = true;
                break;
            }

            if (i == 2 && j ==2) {
                System.out.println("O NIE!!! WDEPLES W MINE!!");
                System.out.println(s.mina);
                mina = true;
                break;
            }

            if ((i == 1 && j ==1) || (i==1 && j==2) || (i==2 && j==1)){
                System.out.println("Uwazaj w okolicy jest mina!");
            }

            if ((i == 3 && j ==2) || (i==2 && j==3) || (i==4 && j==3)|| (i==3 && j==4)){
                System.out.println("uuuuuuuuu skarb jest blisko");
            }
        }

        System.out.println("Trasa, ktora przebyles to:" + stos);
    }














}

 class Skarb1 {

    String s;
    String mina;
    public Skarb1() {
        this.s = "　　██░▀██████████████▀░██\n" +
                "　　█▌▒▒░████████████░▒▒▐█\n" +
                "　　█░▒▒▒░██████████░▒▒▒░█\n" +
                "　　▌░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▐\n" +
                "　　░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░\n" +
                "　 ███▀▀▀██▄▒▒▒▒▒▒▒▄██▀▀▀██\n" +
                "　 ██░░░▐█░▀█▒▒▒▒▒█▀░█▌░░░█\n" +
                "　 ▐▌░░░▐▄▌░▐▌▒▒▒▐▌░▐▄▌░░▐▌\n" +
                "　　█░░░▐█▌░░▌▒▒▒▐░░▐█▌░░█\n" +
                "　　▒▀▄▄▄█▄▄▄▌░▄░▐▄▄▄█▄▄▀▒\n" +
                "　　░░░░░░░░░░└┴┘░░░░░░░░░\n" +
                "　　██▄▄░░░░░░░░░░░░░░▄▄██\n" +
                "　　████████▒▒▒▒▒▒████████\n" +
                "　　█▀░░███▒▒░░▒░░▒▀██████\n" +
                "　　█▒░███▒▒╖░░╥░░╓▒▐█████\n" +
                "　　█▒░▀▀▀░░║░░║░░║░░█████\n" +
                "　　██▄▄▄▄▀▀┴┴╚╧╧╝╧╧╝┴┴███\n" +
                "　　██████████████████████";

        this.mina = "███████████████████████████\n" +
                "███████▀▀▀░░░░░░░▀▀▀███████\n" +
                "████▀░░░░░░░░░░░░░░░░░▀████\n" +
                "███│░░░░░░░░░░░░░░░░░░░│███\n" +
                "██▌│░░░░░░░░░░░░░░░░░░░│▐██\n" +
                "██░└┐░░░░░░░░░░░░░░░░░┌┘░██\n" +
                "██░░└┐░░░░░░░░░░░░░░░┌┘░░██\n" +
                "██░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░██\n" +
                "██▌░│██████▌░░░▐██████│░▐██\n" +
                "███░│▐███▀▀░░▄░░▀▀███▌│░███\n" +
                "██▀─┘░░░░░░░▐█▌░░░░░░░└─▀██\n" +
                "██▄░░░▄▄▄▓░░▀█▀░░▓▄▄▄░░░▄██\n" +
                "████▄─┘██▌░░░░░░░▐██└─▄████\n" +
                "█████░░▐█─┬┬┬┬┬┬┬─█▌░░█████\n" +
                "████▌░░░▀┬┼┼┼┼┼┼┼┬▀░░░▐████\n" +
                "█████▄░░░└┴┴┴┴┴┴┴┘░░░▄█████\n" +
                "███████▄░░░░░░░░░░░▄███████\n" +
                "██████████▄▄▄▄▄▄▄██████████\n" +
                "███████████████████████████\n";
    }

}
