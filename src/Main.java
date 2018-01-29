public class Main {


    public static void main(String[] args) {
        //TestSyntax
        /*  class ClassName{
            public ClassName(){
            }
            public static sMethod(){
            new ClassName().nsMethod();
            }
            public nsMethod(){
            println('non static method')
            }
            } */
        Implementations TestSyntaxCall = new Implementations();
        TestSyntaxCall.printSrtHW();
        /* 1. Дано два числа. Найти минимальное число из них.*/
        //minOfTwo
        int a = 3000;
        int b = 3001;
        Implementations miOfTwoCall = new Implementations();
        System.out.println(miOfTwoCall.minOfTwo(a, b));
        /* 2. Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.*/
        //summArray
        int [] c = {20, 15, 30, 30, 40, 30};
        int k = 30;
        Implementations summArrayCall = new  Implementations();
        System.out.println(summArrayCall.summArray(c, k));
        //arrWithZero
        /* 3. В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.*/
        int [] d = {20, 0, 15, 30, 30, 40, 30, 0};
        Implementations arrWithZeroCall = new  Implementations();
        arrWithZeroCall.arrWithZero(d);
        //arrPosNeg
        /* 4. Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число
            встречается раньше – положительное или отрицательное.*/
        int [] e = {0, 0, 15, 30, 30, 40, 30, 0};
        Implementations arrPosNegCall = new  Implementations();
        arrPosNegCall.arrPosNeg(e);
        //isSorted
        /* 5. Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.*/
        int [] f = {10, 20, 25, 30, 35, 40, 45, 100, 200};
        Implementations arrIsSortCall = new  Implementations();
        arrIsSortCall.arrIsSort(f);
        /* 6. Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести
            сообщение об этом факте.*/
        int [] g = {11, 20};
        Implementations arrEvenCall = new  Implementations();
        int [] i = arrEvenCall.arrEven(g);
        if (i == null) System.out.println("There are no even numbers in the array!");
        else {
                System.out.println("There are following even numbers in the array:");
                for (int j = 0; j < i.length; j++) {
                    System.out.print((i[j]) + " ");
                }
        }
        System.out.println();
        /* 7. Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать
        количество замен.*/
        System.out.println("7. Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать количество замен.\n" +
                "(дополнительно возвращает новый массив, работа с двумерным массивом):");

        int z = 90;
        int [] h = {10, 20, 25, 30, 35, 40, 45, 100, 200};
        Implementations arrReplaceZCall = new  Implementations();
        int [][] j = arrReplaceZCall.arrReplaceZ(h, z);
        //int [][] j = {{10, 20, 25, 30, 35, 40, 45, 100, 200},{2}};
        System.out.println("There are following numbers in the new array:");
        int l = j[0].length;
        for (int m = 0 ; m <l ; m++) {
            System.out.print((j[0][m]) + " ");
        }
        System.out.println();
        System.out.println("Total count of replacements: " + (j)[1][0]);

        /* 8. Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых
        элементов.*/
        int [] n = {-10, 0, 25, 30, 35, 40, 45, 100, 200};
        Implementations arrPosZerNegCall = new  Implementations();
        int [] o = arrPosZerNegCall.arrPosZerNeg(n);
        System.out.println("There are negative numbers count in the array: " + o[0]);
        System.out.println("There are zero numbers count in the array: " + o[1]);
        System.out.println("There are positive numbers count in the array: " + o[2]);
    }
}




