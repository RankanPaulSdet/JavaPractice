public class ReverseString {
    public static void main(String[] args) {
        String val = "Automaion";
        String rev="";
//        logic 1
//        for(int i = val.length()-1; i>=0;i--){
//            rev = rev+val.charAt(i);
//        }
//        System.out.println("Reverse String: "+rev);
        //Logic 2

        char a[] = val.toCharArray();

        for(int i = a.length-1;i>=0;i--){
            rev = rev + a[i];
        }
        System.out.println("Reverse String: "+rev);
    }
}
