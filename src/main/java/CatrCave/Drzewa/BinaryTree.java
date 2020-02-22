package CatrCave.Drzewa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree {

    public static Node root;

    public static void addToTree(int newValue) {
        if (root == null) {
            root = new Node(newValue, null, null);
            return;
        }

        Node current = root;

        while (true) {
            if (newValue < current.getValue()) {
                if (current.getLeft() == null) {
                    current.setLeft(new Node(newValue, null, null));
                    break;
                }
                current = current.getLeft();

            } else {
                if (current.getRight() == null) {
                    current.setRight(new Node(newValue, null, null));
                    break;
                }
                current = current.getRight();
            }
        }
    }
    //ile liści czyli bezdzietne węzły
    public static int childLessNodes(){

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

    //metoda do sprawdzenia
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


