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
            if ((a[i])%k == 0) {result = result + a[i];}
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

    public int [] arrMinMaxRotate (int [] a) {
        int l = a.length;

        int maxindex = 0;
        int minindex = 0;
        for (int i = 0 ; i < l ; i++) {
            if (a[i] > a[maxindex]) {maxindex = i;}
            if (a[i] < a[minindex]) {minindex = i;}
        }
        int temp = a[maxindex];
        a[maxindex] =  a[minindex];
        a[minindex] = temp;

        return a;
    }

    public void arrPrintI (int [] a, int i) {
        for (int m = 0 ; m < a.length ; m++) {
            if ((a[m]) <= i) {System.out.print((a[m]) + " ");}
        }
    }

    public void arrPrintML (int [] a, int m, int l) {
        int k = a.length;
        for (int i= 0 ; i < k ; i++) {
            if (a[i]%m == l) {
            System.out.print((a[i]) + " ");
            }
        }
    }

    public int [] arrRevert2 (int [] a) {
        int k = a.length;
        int temp;
        for (int i= 1 ; i < k ; i = i + 2) {
            temp = a[i];
            a[i] = a[i - 1];
            a[i - 1] = temp;
        }
        return a;
    }

    public void arrPrintTillZero (int [] a) {
        int count = 0;
        int l = a.length;
        while (count < l && a[count] != 0) {
            count++;
        }
        for (int i = 0; i <= count; i++) {
            System.out.print(a[i] + " ");
        }



    }

    public int [] arrMinMax (int [] a) {
        int [] result = new int [2];
        int l = a.length;
        int maxindex = 0;
        int minindex = 0;
        for (int i = 1 ; i < l ; i = i + 2) {
            if (a[(i-1)] > a[maxindex]) {maxindex = (i-1);}
            if (a[(i)] < a[minindex]) {minindex = i;}
        }

/*
        for (int i = 1 ; i < l - 1 ; i = i + 2) {
            //if (a[i] > a[maxindex]) {maxindex = i;}
            if (a[i] < a[minindex]) {minindex = i;}
        }
*/

        result [0] = a[maxindex];
        result [1] = a[minindex];
        return result;
    }

    public long arrIntProduct (int [] a, int m) {
        int l = a.length;
        long result = 1;
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (a[i] > m) {
                result = result * a[i];
                count++;
            }
        }
        if (count == 0) {result = -1;}
        return result;
    }

    public int [] arrABSMaxToZero (int [] a) {
        int l = a.length;
        int maxindex = 0;
        for (int i = 0 ; i < l ; i++) {
            if (a[i] > a[maxindex]) {
                maxindex = i;
            }
        }
        for (int i = 0 ; i < l ; i++) {
            if ((Math.abs(a[i])) > a[maxindex]) {a[i] = 0;}
        }
        return a;
    }

    public long [] arrP1P2 (int [] a) {
        long [] result = new long [3];
        int l = a.length;
        long P1 = 1;
        long P2 = 1;
        int flag = 1;

        for (int i = 0 ; i < l ; i++) {
            if (a[i] < 0) { P1 = P1 * a[i];}
            if (a[i] > 0) { P2 = P2 * a[i];}
        }

        if ( (Math.abs(P1)) > (Math.abs(P2)) ) { flag = 0; }

        result [0] = flag;
        result [1] = P1;
        result [2] = P2;
        return result;
    }

    public int [] arrReplaceMax2Zero (int [] a) {
        int l = a.length;
        int maxindex = 0;
        for (int i = 0 ; i < l ; i++) {
            if (a[i] > a[maxindex]) {maxindex = i;}
        }
        int maxvalue = a[maxindex];
        for (int i = 0 ; i < l ; i++) {
            if (a[i] == maxvalue) {
              a[i] = 0;
                break;
            }
        }
        return a;
    }

    public int [] newArrBasedOnK (int [] a, int k) {
        int l = a.length;
        int count1 = 0;

        for (int i = 0; i < l; i++) {
            if ((a[i])% 10 == k) {
                count1++;
            }
        }
        int[] result = new int[count1];
        int count2 = 0;
        for (int i = 0; i < l; i++) {
            if ((a[i])% 10 == k) {
                result[count2] = a[i];
                count2++;
            }
        }

    return result;
    }
}



