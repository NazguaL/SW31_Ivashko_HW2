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
        int [] f = {10, 20, 25, 30, 35, 40, 45, 100};
        Implementations arrIsSortCall = new  Implementations();
        arrIsSortCall.arrIsSort(f);

    }
}




