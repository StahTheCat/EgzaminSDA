package CatrCave;

public class Zadanie8_MaximumStream {
    //funkcja zwracająca sumę maksymalnego ciągu



    public static int maxOfStream(int[] tab){
        if (tab.length<2){
            return tab[0];
        }

        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;

        for (int i = 0; i < tab.length; i++) {
            tempSum += tab[i];

            if (tempSum > maxSum){
                maxSum = tempSum;
            }

            if(tempSum<0){
                tempSum = 0;
            }
        }
        return maxSum;
    }


}

