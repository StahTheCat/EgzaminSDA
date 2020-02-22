package CatrCave;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StosTest {

    @Test
    void push() {
        Stos stos = new Stos(4);
        stos.push(10);
        stos.push(20);
        stos.push(30);
        stos.push(40);

        int[] expected = {10, 20, 30, 40};
        int[] recived = stos.getStos();
        Assertions.assertArrayEquals(expected, recived);

    }

    @Test
    void pop() {
        Stos stos = new Stos(100);
        stos.push(10);
        stos.push(20);
        stos.push(30);
        stos.push(40);
        stos.push(50);
        stos.push(60);

        int expected = 60;
        int recived = stos.pop();

        Assertions.assertEquals(expected, recived);
    }

    @Test
    void size() {
        Stos stos = new Stos(100);
        stos.push(10);
        stos.push(20);
        stos.push(30);
        stos.push(40);
        stos.push(50);
        stos.push(60);

        int expected = 6;
        int recived = stos.size();

        Assertions.assertEquals(expected, recived);
    }

    @Test
    void isEmpty() {
        Stos stos = new Stos(100);
        stos.push(10);
        stos.push(20);
        stos.push(30);
        stos.push(40);
        stos.push(50);
        stos.push(60);

        Assertions.assertFalse(stos.isEmpty());
    }

    @Test
    void isEmpty1() {
        Stos stos = new Stos(100);
        Assertions.assertTrue(stos.isEmpty());
    }

    @Test
    void odwróć() {
        Stos stos = new Stos(4);
        stos.push(10);
        stos.push(20);
        stos.push(30);
        stos.push(40);

        int[] expected = {40, 30, 20, 10};
        stos.odwróć();

        Assertions.assertArrayEquals(expected, stos.getStos());
    }
}