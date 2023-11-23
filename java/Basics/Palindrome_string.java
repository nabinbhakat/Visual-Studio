public class Palindrome_string {
    public static void check_string(String str) {
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("String is not a palindrome");
                return;
            }
        }
        System.out.println("String is a palindrome");
    }
    public static void main(String[] args) {
        //String str="nabin";
        String str="noon";
        check_string(str);
    }
}
