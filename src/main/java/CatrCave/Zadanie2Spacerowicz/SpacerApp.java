package CatrCave.Zadanie2Spacerowicz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class SpacerApp {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int i = 10;
        int j = 10;

        LinkedList<Character> stos = new LinkedList<>();

        System.out.println("Wybierz: \nP aby iść w prawo \n" +
                "L aby iść w lewo \n" +
                "G aby iść w górę \n" +
                "D aby iść w dół \n" +
                "wpisz: ZAKOŃCZ aby zakończyć");

        label:
        while (true) {
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

        }

        System.out.println(stos);


    }


}
