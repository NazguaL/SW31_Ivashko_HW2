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
        System.out.println();
        System.out.println("8. Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов:");
        int [] n = {-10, 0, 25, 30, 35, 40, 45, 100, 200};
        Implementations arrPosZerNegCall = new  Implementations();
        int [] o = arrPosZerNegCall.arrPosZerNeg(n);
        System.out.println("There are negative numbers count in the array: " + o[0]);
        System.out.println("There are zero numbers count in the array: " + o[1]);
        System.out.println("There are positive numbers count in the array: " + o[2]);

        /*9. Дан массив чисел. Поменять местами наибольший и наименьший элементы.*/
        int [] m9 = {3000, -1000, 25, 30, 35, 400, 45, 100, -8000};
        System.out.println("9. Дан массив чисел. Поменять местами наибольший и наименьший элементы.:");
        Implementations arrMinMaxRotateCall = new  Implementations();
        int [] a9 = arrMinMaxRotateCall.arrMinMaxRotate(m9);
        System.out.println("There are following numbers in the new array:");
        int l9 = a9.length;
        for (int m = 0 ; m <l9 ; m++) {
            System.out.print((a9[m]) + " ");
        }
        System.out.println();

        /*10. Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.*/
        int [] m10 = {3000, -1000, 25, 30, 35, 400, 45, 100, -8000};
        System.out.println("10. Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.:");
        Implementations arrPrintICall = new  Implementations();
        int i10 = 5;
        arrPrintICall.arrPrintI(m10,i10);
        System.out.println();

        /*11. Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.*/
        System.out.println("11. Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.:");
        int [] arr11 = {1, 3, 2, 5, 3, 4};
        int m11 = 2;
        int l11 = 1;
        Implementations arrPrintMLCall = new  Implementations();
        arrPrintMLCall.arrPrintML(arr11, m11, l11);
        System.out.println();

        /*12. Дан массив чисел. Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3].*/
        System.out.println("12. Дан массив чисел. Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3].:");
        int [] arr12 = {1, 3, 2, 5, 3, 4, 7};
        Implementations arrRevert2Call = new  Implementations();
        int [] mas12 = arrRevert2Call.arrRevert2(arr12);
        int l12 = mas12.length;
        for (int m = 0 ; m <l12 ; m++) {
            System.out.print((mas12[m]) + " ");
        }
        System.out.println();

        /*13. Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно до нуля.*/
        System.out.println("13. Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно до нуля.:");
        int [] arr13 = {1, 3, 2, 5, 3, 0, 4, 7};
        Implementations arrPrintTillZeroCall = new  Implementations();
        arrPrintTillZeroCall.arrPrintTillZero(arr13);
        System.out.println();

        /* 14. Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]). */
        System.out.println("14. Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).:");
        int [] arr14 = {3000, -1000, 25, 30, 35, 400, 45, 100, -8000, 7, 10000};
        Implementations arrMinMaxCall = new  Implementations();
        int [] mas14 = arrMinMaxCall.arrMinMax(arr14);
        System.out.println("mаx(а[0], а[2], ..., а[2к]): " + mas14[0]);
        System.out.println("min(а[1], а[3], …, а[2к-1]): " + mas14[1]);
        
        /*15. Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше заданного числа М. Если таких нет, то выдать сообщение об этом.*/
    }
}




