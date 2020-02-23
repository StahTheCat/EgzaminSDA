package CatrCave;
    // ZADANIE 1
public class Zadanie1_4_Stos {

    int[] stos;
    int topElement;

    public Zadanie1_4_Stos(int size) {
        this.stos = new int[size];
        this.topElement = 0;
    }

    public void push(int x) {
        stos[topElement] = x;
        topElement++;
    }

    public int pop() {
        int temp = stos[topElement - 1];
        topElement--;
        return temp;
    }


    public int size() {
        return topElement;
    }

    public boolean isEmpty() {

        if (topElement == 0){
            return true;
        } else {
            return false;
        }
    }

    public int[] getStos() {
        return stos;
    }

    // ZANIDANIE 4
    public void odwróć(){
        for (int i = 0; i < (topElement/2); i++) {
            int temp = stos[i];
            stos[i] = stos[topElement-1-i];
            stos[topElement-1-i] = temp;
        }
    }


}
