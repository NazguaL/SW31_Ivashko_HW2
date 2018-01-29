/**
 * Created by User on 24.01.2018.
 */
public class Implementations {
    public void printSrtHW () {
        System.out.println("Hello, World!!!");
    }

    public int minOfTwo(int a, int b)
    {
        if (a < b) return a;
        else return b;
    }

    public int summArray(int [] a, int k)
    {
        int result = 0;
        for (int i = 0 ; i < a.length ; i++){
            if (a[i] == k) {result = result + k;}
        }
        return result;
    }

    public void arrWithZero(int [] a)
    {
        int count = 0;
        for (int i = 0 ; i < a.length ; i++){
            if (a[i] == 0) {count++;}
        }
        if (count > 0) {
            int[] result = new int[count];

            int index = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 0) {
                    result[index] = i;
                    index++;
                }
            }
            System.out.println("There are folowing positions of \"zero\" elements in the array: ");
            for (int j = 0; j < result.length; j++) {
                System.out.print((result[j]+1) + " ");
            }
            System.out.println("");
        }
        else {
            System.out.println("There are no \"zero\" elements in the array!");
        }
    }

    public void arrPosNeg(int [] a)
    {
        int flag = 0;
        int i = 0;
        while ( flag == 0 && i < a.length) {

            if (a[i] > 0) {
                flag = 1;
            }
            else if (a[i] < 0) {
                flag = -1;
            }
            else {
                flag = 0;
            }
            i++;
        }
        System.out.println("");
        if (flag == 1) { System.out.println("Positive");}
        else if (flag == -1) {System.out.println("Negative");}
        else {System.out.println("Array containts no elements or only zero elements");}
    }

    public void arrIsSort(int [] a) {

        boolean Sorted = true;
        int i = 0;

        while (Sorted == true && i < a.length-1) {
                if (a[i] > a[i + 1]) Sorted = false;
                i++;
        }
        if (Sorted == false) {System.out.println("The array isn't sorted in ascending order.");}
        else {System.out.println("The array is sorted in ascending order.");}
        }

    public int [] arrEven (int [] a) {

    int count = 0;
        for (int i = 0 ; i < a.length ; i++){
        if ((a[i]%2) == 0) {count++;}
    }

    if (count == 0) return null;

    //    System.out.println(count);
    // Признайтесь честно, алертами код дебажили?))

    //if (count == 0) return null;

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i]%2) == 0) {
                result[index] = a[i];
            index++; }

    }
    return result;
    }

    public int [][] arrReplaceZ (int [] a, int z) {
        int l = a.length;

        int [][] result = new int [2][];
        result [0] = new int [l];
        result [1] = new int [1];

        int count =0;
        for (int i = 0 ; i < l ; i++) {
            if (a[i] > z) {result [0][i] = z; count++;}
            else {result [0][i] = a[i];}

        }
        result [1][0] = count;
        return result;
    }

    public int [] arrPosZerNeg (int [] a) {
        int [] result = new int [3];
        int l = a.length;
        for (int i = 0 ; i < l ; i++) {
            if (a[i] < 0) {result[0]++;}
            else if (a[i] == 0) {result[1]++;}
            else {result[2]++;}
        }
        return result;
    }
}



