public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 4114;
        int OrgNum = num;
        int rev = 0;

        while(num!=0){
            rev = rev*10+num%10;
            num=num/10;

        }
        if(OrgNum==rev){
            System.out.println(rev+" is palindrome number");
        }else {
            System.out.println(rev+" is not palindrome number");
        }
    }
}
