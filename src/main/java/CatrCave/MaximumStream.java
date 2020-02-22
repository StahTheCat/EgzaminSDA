package CatrCave;

public class MaximumStream {
    //funkcja zwracająca sumę maksymalnego ciągu

    public static void main(String[] args) {
        int[] tab = {-1,2,3,4,-2};
        System.out.println(maxOfStream(tab));

        int[] tab1 = {-1,2,3,4,-2,6};
        System.out.println(maxOfStream(tab1));

    }

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

