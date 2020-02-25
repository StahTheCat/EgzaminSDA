package CatrCave.Zadanie2Spacerowicz;

import java.util.LinkedList;

import static CatrCave.Zadanie2Spacerowicz.Gracz.checkForSurprise;
import static CatrCave.Zadanie2Spacerowicz.Gracz.move;

public class SpacerApp {


    public static void main(String[] args) {


        System.out.println("Wybierz: \nP aby iść w prawo \n" +
                "L aby iść w lewo \n" +
                "G aby iść w górę \n" +
                "D aby iść w dół \n" +
                "wpisz: ZAKOŃCZ aby zakończyć");

        System.out.println();
        System.out.println("Podobno na północnym-wchodzie jest skarb...");
        System.out.println("ale uważaj na MINY!");


        LinkedList<Character> stos = new LinkedList<>();
        Gracz gracz = new Gracz();

        boolean ruch = true;
        boolean niespodzianki = true;

        while (ruch && niespodzianki) {
             ruch = move(stos, gracz);
             niespodzianki = checkForSurprise(gracz);

          }
        System.out.print("Trasa, ktora przebyles to: " + stos);

        }

    }



