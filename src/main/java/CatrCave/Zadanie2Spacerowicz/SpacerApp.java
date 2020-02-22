package CatrCave.Zadanie2Spacerowicz;

import java.util.LinkedList;
import java.util.Scanner;

public class SpacerApp {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int i = 10;
        int j = 10;

        LinkedList<Character> stos = new LinkedList();


        label:
        while (true){
            String move = scn.nextLine();
            switch (move) {
                case "P":
                    j++;
                    System.out.println("Twoja pozycja to " + i + " " + j);
                    stos.push('P');

                    break;
                case "L":
                    j--;
                    System.out.println("Twoja pozycja to " + i + " " + j);
                    stos.push('L');

                    break;
                case "G":
                    i++;
                    System.out.println("Twoja pozycja to " + i + " " + j);
                    stos.push('G');

                    break;
                case "D":
                    i--;
                    System.out.println("Twoja pozycja to " + i + " " + j);
                    stos.push('D');

                    break;
                case "ZAKOŃCZ":
                    break label;
                default:
                    System.out.println("Nieprawidłowy ruch");
                    break;
            }

        }

        for (int k = 0; k<stos.size(); k++) {
            System.out.print(stos.get(k) +" ");
        }




    }





}
