package CatrCave;

public class InsertionSort {

    public static void main(String[] args) {

        int[] tab = {10,9,8,7,6,5,4,3,2,1};
        insertionSort(tab);

        for (int num: tab ) {
            System.out.print(num+ " ");
        }
    }


    public static void insertionSort(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            int temp = tab[i];
            int j = i - 1;

            while (j >= 0 && tab[j] > temp){
                tab[j+1] = tab[j];
                j--;
            }
            tab[j+1] = temp;
        }
    }
}


