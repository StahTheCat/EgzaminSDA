package CatrCave.Drzewa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zadania3_5_7_BinaryTree {

    public static Node root;

    //              ZADANIE 3 - FUNKCJA ZLICZA LIŚCIE (BEZDZIETNE WĘZŁY)

    public static int zadanie3childLessNodes(){

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

    public static void treeSwitcher(){
        if (root == null) {
            System.out.println("Sadly, this tree is empty. So You can add something :)");

        }
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Node> queue = new LinkedList<>();

        Node current = root;
        stack.push(current);
        queue.addLast(current);

        while (!queue.isEmpty()){
            current = queue.removeFirst();

            if (current.getLeft() != null) {
                queue.addLast(current.getLeft());
                stack.push(current.getLeft());

            }

            if (current.getRight() != null) {
                queue.addLast(current.getRight());
                stack.push(current.getRight());
            }

        }

        while (!stack.isEmpty()) {
            current = stack.pop();

            if (current.getLeft() != null && current.getRight() != null) {

                Node temp = current.getLeft();
                current.setLeft(current.getRight());
                current.setRight(temp);
            }
            if (current.getLeft() != null && current.getRight() == null) {

                current.setLeft(current.getRight());
                current.setRight(null);
            }

            if (current.getLeft() == null && current.getRight() != null) {

                current.setRight(current.getLeft());
                current.setLeft(null);
            }

        }

    }

    //ZADANIE 7 FUNKCJA SPRAWDZA CZY DRZEWO JEST SYMETRYCZNE

    public static boolean isSymetric(){


        List<Integer> expected = treeToArray();
        treeSwitcher();
        List<Integer> recived = treeToArray();

        System.out.println(expected);
        System.out.println(recived);

        if (recived.equals(expected)){
            return true;
        } else {
            return false;
        }

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


