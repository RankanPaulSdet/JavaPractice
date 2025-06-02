public class PalindromeString {
    public static void main(String[] args) {
        String val = "madam";
        String OrgVal=val;
        String rev = "";

        for(int i = val.length()-1;i>=0;i--){
            rev = rev + val.charAt(i);
        }
        if (OrgVal.equals(rev)){
            System.out.println(rev+" is palindrome number");
        }else {
            System.out.println(rev+" is not palindrome number");
        }
        }
    }

