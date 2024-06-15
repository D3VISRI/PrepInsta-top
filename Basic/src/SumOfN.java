public class SumOfN {
    public static void main(String[] args) {
        Method1_Loop();
        Method2_Formula();
        int sum =Method3_Recursion(20);
        System.out.println(sum);
    }
    static void Method1_Loop(){
        int n = 20;
        int sum = 0;
        for (int i =1;i<=n; i++){
            sum +=i;

        }
        System.out.println(sum);
    }
    static void Method2_Formula(){
        int n =10;

        System.out.println(n*(n+1)/2);
    }

    ///Recursion

    static int Method3_Recursion(int n ){
        if (n == 0)return n;
        return n+ Method3_Recursion(n-1);

    }
}