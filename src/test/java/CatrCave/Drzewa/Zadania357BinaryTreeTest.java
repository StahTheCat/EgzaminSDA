package CatrCave.Drzewa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Zadania357BinaryTreeTest {

    @Test
        void childLessNodes() {


        Node g = new Node (3, null, null);
        Node f = new Node (3, null, null);
        Node e = new Node (3, null, null);
        Node d = new Node (3, null, null);
        Node c = new Node (2, f, g);
        Node b = new Node (2, d, e);
        Zadania3_5_7_BinaryTree.root = new Node (1, b, c);

       int expected = 4;
       int received = Zadania3_5_7_BinaryTree.zadanie3childLessNodes();

        Assertions.assertEquals(expected,received);
    }



    @Test
    void treeSwitcher1(){
        Node g = new Node (7, null, null);
        Node f = new Node (6, null, null);
        Node e = new Node (5, null, null);
        Node d = new Node (4, null, null);
        Node c = new Node (3, f, g);
        Node b = new Node (2, d, e);
        Zadania3_5_7_BinaryTree.root = new Node (1, b, c);

        List<Integer> expected = Arrays.asList(1,3,2,7,6,5,4);
        Zadania3_5_7_BinaryTree.treeSwitcher();
        List<Integer> received = Zadania3_5_7_BinaryTree.treeToArray();

        Assertions.assertEquals(expected,received);

    }

    @Test
    void treeSwitcher() {

        Node g = new Node (20, null, null);
        Node f = new Node (11, null, null);
        Node e = new Node (8, null, null);
        Node d = new Node (6, null, null);
        Node c = new Node (15, f, g);
        Node b = new Node (7, d, e);
        Zadania3_5_7_BinaryTree.root = new Node (10, b, c);


        List<Integer> expected = Arrays.asList(10,15,7,20,11,8,6);
        Zadania3_5_7_BinaryTree.treeSwitcher();
        List<Integer> received = Zadania3_5_7_BinaryTree.treeToArray();

        Assertions.assertEquals(expected,received);
    }

    @Test
    void isSymetric() {


        Node g = new Node (12, null, null);
        Node f = new Node (4, null, null);
        Node e = new Node (6, null, null);
        Node d = new Node (7, null, null);
        Node c = new Node (8, f, g);
        Node b = new Node (4, d, e);
        Zadania3_5_7_BinaryTree.root = new Node (1, b, c);

        Assertions.assertFalse(Zadania3_5_7_BinaryTree.isSymetric());
    }

    @Test
    void isSymetric1() {


        Node g = new Node (3, null, null);
        Node f = new Node (3, null, null);
        Node e = new Node (3, null, null);
        Node d = new Node (3, null, null);
        Node c = new Node (2, f, g);
        Node b = new Node (2, d, e);
        Zadania3_5_7_BinaryTree.root = new Node (1, b, c);


        Assertions.assertTrue(Zadania3_5_7_BinaryTree.isSymetric());
    }
    @Test
    void isSymetric2() {


        Node f = new Node (3, null, null);
        Node e = new Node (3, null, null);
        Node d = new Node (3, null, null);
        Node c = new Node (2, f, null);
        Node b = new Node (2, d, e);
        Zadania3_5_7_BinaryTree.root = new Node (1, b, c);


        Assertions.assertFalse(Zadania3_5_7_BinaryTree.isSymetric());
    }

    @Test
    void isSymetric3() {


        Node g = new Node (4, null, null);
        Node f = new Node (3, null, null);
        Node e = new Node (3, null, null);
        Node d = new Node (3, null, null);
        Node c = new Node (2, f, g);
        Node b = new Node (2, d, e);
        Zadania3_5_7_BinaryTree.root = new Node (1, b, c);


        Assertions.assertFalse(Zadania3_5_7_BinaryTree.isSymetric());
    }


}