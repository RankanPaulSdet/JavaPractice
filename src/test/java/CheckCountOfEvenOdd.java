public class CheckCountOfEvenOdd {
    public static void main(String[] args) {
        int num = 1234567;
        int Even_Count = 0;
        int Odd_count = 0;
        int rem=0;

        while (num!=0){
            rem = rem+num%10;
            num = num/10;
            if(rem%2==0){
                Even_Count++;
            }else {
                Odd_count++;
            }
        }
        System.out.println("Count of even number: "+ Even_Count+ "\n"+ "Count of odd number: "+Odd_count);

    }
}
