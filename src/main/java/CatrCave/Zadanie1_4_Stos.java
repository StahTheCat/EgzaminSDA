package CatrCave;

// ZADANIE 1
public class Zadanie1_4_Stos {

    private int[] stos;
    private int topElement;

    public Zadanie1_4_Stos(int size) {
        this.stos = new int[size];
        this.topElement = 0;
    }

    public void push(int x) {
        stos[topElement++] = x;
    }

    public int pop() {
        return stos[--topElement];
    }

    public int size() {
        return topElement;
    }

    public boolean isEmpty() {
        return topElement == 0;
    }

    public int[] getStos() {
        return stos;
    }


    public void odwróć(Zadanie1_4_Stos stos) {

        if (this.stos == null) {
            System.out.println("Stos jest pusty");
            return;
        }

        int n = stos.size();
        Zadanie1_4_Stos kopiaStosu = new Zadanie1_4_Stos(n);
        for (int i = 0; i < n; i++) {
            kopiaStosu.push(stos.pop());
        }
        this.stos = kopiaStosu.getStos();

    }


}
