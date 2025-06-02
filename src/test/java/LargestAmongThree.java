public class LargestAmongThree {
    public static void main(String[] args) {
        int a = 100, b = 1023, c=922;

        if(a>b && a>c){
            System.out.println("Largest number is a: "+a);
        } else if (b>a && b>c) {
            System.out.println("Largest number is b: "+b);
        }else {
            System.out.println("Largest number is c: "+c);
        }
    }
}
