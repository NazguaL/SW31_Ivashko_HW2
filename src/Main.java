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
        //minOfTwo
        int a = 3000;
        int b = 3001;
        Implementations miOfTwoCall = new Implementations();
        System.out.println(miOfTwoCall.minOfTwo(a, b));
        //summArray
        int [] c = {20, 15, 30, 30, 40, 30};
        int k = 30;
        Implementations summArrayCall = new  Implementations();
        System.out.println(summArrayCall.summArray(c, k));
        //arrWithZero
        int [] d = {20, 0, 15, 30, 30, 40, 30, 0};
        Implementations arrWithZeroCall = new  Implementations();
        arrWithZeroCall.arrWithZero(d);
        //isSorted
        int [] e = {10, 20, 25, 30, 35, 40, 45, 100};
        Implementations arrIsSortCall = new  Implementations();
        arrWithZeroCall.arrIsSort(e);

    }
}




