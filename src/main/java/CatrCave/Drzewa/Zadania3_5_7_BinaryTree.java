package CatrCave.Drzewa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zadania3_5_7_BinaryTree {

    public static Node root;

    //              ZADANIE 3 - FUNKCJA ZLICZA LIŚCIE (BEZDZIETNE WĘZŁY)

    public static int zadanie3childLessNodes() {

        int counter = 0;

        if (root == null) {
            System.out.println("Sadly, this tree is empty. So You can add something :)");
            return 0;
        }
        LinkedList<Node> searchQueue = new LinkedList<>();

        Node current = root;
        searchQueue.addLast(current);

        while (!searchQueue.isEmpty()) {
            current = searchQueue.removeFirst();

            if (current.getLeft() == null && current.getRight() == null) {
                counter++;
            }

            if (current.getLeft() != null) {
                searchQueue.addLast(current.getLeft());
            }

            if (current.getRight() != null) {
                searchQueue.addLast(current.getRight());
            }
        }
        return counter;
    }

    //ZADANIE 5 - FUNKACJA ODWRACA DRZEWO

    public static void treeSwitcher() {
        if (root == null) {
            System.out.println("Sadly, this tree is empty. So You can add something :)");
            return;
        }

        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Node> queue = new LinkedList<>();

        Node current = root;
        stack.push(current);
        queue.addLast(current);

        while (!queue.isEmpty()) {
            current = queue.removeFirst();

            if (current.getLeft() != null) {
                queue.addLast(current.getLeft());
                stack.push(current.getLeft());
            }

            if (current.getRight() != null) {
                queue.addLast(current.getRight());
                stack.push(current.getRight());
            }
            current = stack.pop();

            Node temp = current.getLeft();
            current.setLeft(current.getRight());
            current.setRight(temp);
        }
    }


    // Podpowiedź - możesz stworzyć i zastosować rekurencyjną metodę - zaczynając od korzenia,
    // podajesz do niej lewe i prawe dziecko korzenia - jeśli nie są takie same to zwróć fałsz, jeśli są,
    // to wywołaj rekurencyjnie tą metodę z bliźniaczymi węzłami -
    // lewe dziecko jednego z prawym dzieckiem drugiego, oraz prawe dziecko jednego z lewym dzieckiem drugiego -
    // i tak aż trafisz na dwa liście

    //ZADANIE 7 FUNKCJA SPRAWDZA CZY DRZEWO JEST SYMETRYCZNE
    public static boolean isSymetric(Node current) {

        if (root == null){
            //Zwraca false gdy drzewo jest puste
            System.out.println("This tree is empty :( ");
            return false;
        }


        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(current.getLeft());
        queue.addLast(current.getRight());

        while (!queue.isEmpty()){
            Node nodeLeft = queue.removeFirst();
            Node nodeRight;
            if (queue.isEmpty()){
                return false;
            } else {
                nodeRight  = queue.removeFirst();
            }

            if (nodeLeft.getValue() != nodeRight.getValue()){
                return false;
            }

            if (nodeLeft.getLeft() != null) {
                queue.addLast(nodeLeft.getLeft());
            }
            if (nodeRight.getRight() != null) {
                queue.addLast(nodeRight.getRight());
            }

            if (nodeLeft.getRight() != null) {
                queue.addLast(nodeLeft.getRight());
            }

            if (nodeRight.getLeft() != null) {
                queue.addLast(nodeRight.getLeft());
            }

        }

        return true;
    }


    //METODY POMOCNICZNE

    //metoda do przedurkowania drzewa
    public static List<Integer> treeToArray() {
        if (root == null) {
            System.out.println("This tree is empty :( ");
        }

        List<Integer> arrayToPrint = new ArrayList<>();
        LinkedList<Node> queue = new LinkedList<>();

        Node current = root;
        queue.add(current);

        while (!queue.isEmpty()) {
            current = queue.removeFirst();
            arrayToPrint.add(current.getValue());

            if (current.getLeft() != null) {
                queue.addLast(current.getLeft());
            }

            if (current.getRight() != null) {
                queue.addLast(current.getRight());
            }

        }
        return arrayToPrint;
    }

}


