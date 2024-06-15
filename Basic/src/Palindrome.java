public class Palindrome {
    public static void main(String[] args) {
        Palindrome();
    }
    static void Palindrome(){
        int n  = 1234;
        int rem ;
        int rev =0;
        while(n>0){
            rem =n%10;
            rev = rev*10 +rem;
            n/=10;
        }
        if (n==rev)
            System.out.println("Palindrome");
        else
            System.out.println("no");

    }
}
