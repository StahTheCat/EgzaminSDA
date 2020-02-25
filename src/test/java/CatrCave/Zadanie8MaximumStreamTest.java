package CatrCave;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Zadanie8MaximumStreamTest {

    @Test
    void maxOfStream() {
        Zadanie8_MaximumStream ms = new Zadanie8_MaximumStream();

        int[] tab = {-1,2,3,4,-2};
        int expected = 9;
        int recived = ms.maxOfStream(tab);

        Assertions.assertEquals(expected,recived );
    }

    @Test
    void maxOfStream1() {

        Zadanie8_MaximumStream ms = new Zadanie8_MaximumStream();
        int[] tab = {-1,2,3,4,-2,6};
        int expected = 13;
        int recived = ms.maxOfStream(tab);

        Assertions.assertEquals(expected,recived );

    }
    @Test
    void maxOfStream2() {

        Zadanie8_MaximumStream ms = new Zadanie8_MaximumStream();
        int[] tab = {0,3,0,4,-2,-9,10,1};
        int expected = 11;
        int recived = ms.maxOfStream(tab);

        Assertions.assertEquals(expected,recived );

    }

    @Test
    void powinno_zwrócić_pierwszą_wartość_przy_jednoelementowej_tablicy() {

        Zadanie8_MaximumStream ms = new Zadanie8_MaximumStream();
        int[] tab = {2};
        int expected = 2;
        int recived = ms.maxOfStream(tab);

        Assertions.assertEquals(expected,recived );
    }

    @Test
    void powinno_zwrócić_zero_dla_pustej_tablicy() {

        Zadanie8_MaximumStream ms = new Zadanie8_MaximumStream();
        int[] tab = new int[2];
        int expected = 0;
        int recived = ms.maxOfStream(tab);

        Assertions.assertEquals(expected,recived );
    }



}