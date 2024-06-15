public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("radar".toLowerCase()));
    }
    static boolean isPalindrome(String string){
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }
}
