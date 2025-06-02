public class CountOfPrimeNumbers {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Prime Number: " + i);
                count++;
            }
        }
        System.out.println("Count of Prime NUmbers: "+count);
    }
}
