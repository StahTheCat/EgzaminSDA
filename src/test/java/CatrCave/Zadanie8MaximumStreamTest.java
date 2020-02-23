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
}