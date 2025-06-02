public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 20, b=30;

        //Logic 1
//        int c = a;
//        a = b;
//        b = c;

        //logIc 2
//      int  c=a+b;
//        a=c-a;
//        b=c-b;
        //Logic 3
        int  c=a*b;
        a=c/a;
        b=c/b;

        System.out.println("Value of a: "+a+ "\n"+ "value of b: "+b);
    }
}
