public class RevOfNum {
    public static void main(String[] args) {

        RevWhile();
        int num =1234;
        int rev=0;
        System.out.println(getReverse(num,rev));
        getReverse1(num);
    }

    static void RevWhile(){
        int n  = 1234;
        int rem ;
        int rev =0;
        while(n>0){
            rem =n%10;
            rev = rev*10 +rem;
            n/=10;
        }
        System.out.println(rev);
    }

    static int getReverse(int num, int rev){
        if (num == 0)
            return rev;
        int rem = num%10 ;

        rev = rev * 10 + rem;
        return getReverse(num /10,rev);
    }
    static void getReverse1(int num){
        if (num == 0){
            return;
        }
        int rem = num%10;
        System.out.print(rem);
        getReverse1(num/10);
    }
}
