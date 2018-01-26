/**
 * Created by User on 24.01.2018.
 */
public class Implementations {
    public void printSrtHW () {System.out.println("Hello, World!!!");}

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
        }
        else {
            System.out.println("There are no \"zero\" elements in the array!");
        }
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


    }


