public class SumofDigitsOfaNumber {
    public static void main(String[] args) {
        BruteForce();
        int n = 1234;
        int sum=0;
        System.out.println(Recursion1(n,sum));
        System.out.println(Recursion2(n));
    }
    static void BruteForce(){
        int n = 12345;
        int sum =0;

        while(n>0){
            sum +=n%10;
            n =n/10;

        };
        System.out.println(sum);


    }
    static int Recursion1(int n,int sum){
        if (n==0){
            return sum;


        }sum +=n%10;
        return Recursion1(n/10,sum);
    }
    static int Recursion2(int n){
        if (n ==0)return 0;
        return (n%10)+Recursion2(n/10);
    }

}
