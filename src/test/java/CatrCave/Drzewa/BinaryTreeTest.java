package CatrCave.Drzewa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void add() {
        BinaryTree tree = new BinaryTree();

        tree.addToTree(10);
        tree.addToTree(7);
        tree.addToTree(15);
        tree.addToTree(6);
        tree.addToTree(8);
        tree.addToTree(11);
        tree.addToTree(20);
        tree.addToTree(2);
        tree.addToTree(9);
        tree.addToTree(21);

        List<Integer> expected = Arrays.asList(10,7,15,6,8,11,20,2,9,21);
        List<Integer> received = tree.treeToArray();

        Assertions.assertEquals(expected,received);

    }

    @Test
    void childLessNodes() {

        BinaryTree tree = new BinaryTree();

        tree.addToTree(10);
        tree.addToTree(7);
        tree.addToTree(15);
        tree.addToTree(6);
        tree.addToTree(8);
        tree.addToTree(11);
        tree.addToTree(20);
        tree.addToTree(2);
        tree.addToTree(9);
        tree.addToTree(21);

       int expected = 4;
       int received = tree.childLessNodes();

        Assertions.assertEquals(expected,received);

    }

    @Test
    void treeSwitcher() {

        BinaryTree tree = new BinaryTree();

        tree.addToTree(10);
        tree.addToTree(7);
        tree.addToTree(15);
        tree.addToTree(6);
        tree.addToTree(8);
        tree.addToTree(11);
        tree.addToTree(20);


        List<Integer> expected = Arrays.asList(10,15,7,20,11,8,6);
        tree.treeSwitcher();
        List<Integer> received = tree.treeToArray();

        Assertions.assertEquals(expected,received);
    }

    @Test
    void isSymetric() {

        BinaryTree tree = new BinaryTree();

        tree.addToTree(10);
        tree.addToTree(7);
        tree.addToTree(15);
        tree.addToTree(6);
        tree.addToTree(8);
        tree.addToTree(11);
        tree.addToTree(20);

        Assertions.assertFalse(BinaryTree.isSymetric());
    }
    @Test
    void isSymetric1() {

        BinaryTree tree = new BinaryTree();

        Node g = new Node (3, null, null);
        Node f = new Node (3, null, null);
        Node e = new Node (3, null, null);
        Node d = new Node (3, null, null);
        Node c = new Node (2, f, g);
        Node b = new Node (2, d, e);
        tree.root = new Node (1, b, c);


        Assertions.assertTrue(BinaryTree.isSymetric());
    }

    @Test
    void isSymetric2() {

        BinaryTree tree = new BinaryTree();

        Node f = new Node (3, null, null);
        Node e = new Node (3, null, null);
        Node d = new Node (3, null, null);
        Node c = new Node (2, f, null);
        Node b = new Node (2, d, e);
        tree.root = new Node (1, b, c);


        Assertions.assertFalse(BinaryTree.isSymetric());
    }

    @Test
    void isSymetric3() {

        BinaryTree tree = new BinaryTree();

        Node g = new Node (4, null, null);
        Node f = new Node (3, null, null);
        Node e = new Node (3, null, null);
        Node d = new Node (3, null, null);
        Node c = new Node (2, f, g);
        Node b = new Node (2, d, e);
        tree.root = new Node (1, b, c);


        Assertions.assertFalse(BinaryTree.isSymetric());
    }

}