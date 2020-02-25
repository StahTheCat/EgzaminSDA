package CatrCave;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Zadanie1IZadanie4StosTest {

    @Test
    void push() {
        Zadanie1_4_Stos zadanie14Stos = new Zadanie1_4_Stos(4);
        zadanie14Stos.push(10);
        zadanie14Stos.push(20);
        zadanie14Stos.push(30);
        zadanie14Stos.push(40);

        int[] expected = {10, 20, 30, 40};
        int[] recived = zadanie14Stos.getStos();
        Assertions.assertArrayEquals(expected, recived);

    }

    @Test
    void pop() {
        Zadanie1_4_Stos zadanie14Stos = new Zadanie1_4_Stos(100);
        zadanie14Stos.push(10);
        zadanie14Stos.push(20);
        zadanie14Stos.push(30);
        zadanie14Stos.push(40);
        zadanie14Stos.push(50);
        zadanie14Stos.push(60);

        int expected = 60;
        int expected2 = 50;
        int expected3 = 40;

        int recived = zadanie14Stos.pop();
        int recived2 = zadanie14Stos.pop();
        int recived3 = zadanie14Stos.pop();


        Assertions.assertEquals(expected, recived);
        Assertions.assertEquals(expected2, recived2);
        Assertions.assertEquals(expected3, recived3);

    }

    @Test
    void size() {
        Zadanie1_4_Stos zadanie14Stos = new Zadanie1_4_Stos(100);
        zadanie14Stos.push(10);
        zadanie14Stos.push(20);
        zadanie14Stos.push(30);
        zadanie14Stos.push(40);
        zadanie14Stos.push(50);
        zadanie14Stos.push(60);

        int expected = 6;
        int recived = zadanie14Stos.size();

        Assertions.assertEquals(expected, recived);
    }

    @Test
    void isEmpty() {
        Zadanie1_4_Stos zadanie14Stos = new Zadanie1_4_Stos(100);
        zadanie14Stos.push(10);
        zadanie14Stos.push(20);
        zadanie14Stos.push(30);
        zadanie14Stos.push(40);
        zadanie14Stos.push(50);
        zadanie14Stos.push(60);

        Assertions.assertFalse(zadanie14Stos.isEmpty());
    }

    @Test
    void isEmpty1() {
        Zadanie1_4_Stos zadanie14Stos = new Zadanie1_4_Stos(100);
        Assertions.assertTrue(zadanie14Stos.isEmpty());
    }

    @Test
    void odwróć_kończy_jeśli_stos_pusty() {
        Zadanie1_4_Stos zadanie14Stos = new Zadanie1_4_Stos(4);

        int[] expected = {};
        zadanie14Stos.odwróć(zadanie14Stos);

        Assertions.assertArrayEquals(expected, zadanie14Stos.getStos());
    }

    @Test
    void odwróć() {
        Zadanie1_4_Stos zadanie14Stos = new Zadanie1_4_Stos(4);
        zadanie14Stos.push(10);
        zadanie14Stos.push(20);
        zadanie14Stos.push(30);
        zadanie14Stos.push(40);

        int[] expected = {40, 30, 20, 10};
        zadanie14Stos.odwróć(zadanie14Stos);

        Assertions.assertArrayEquals(expected, zadanie14Stos.getStos());
    }
}