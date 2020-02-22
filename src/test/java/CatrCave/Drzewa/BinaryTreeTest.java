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
}