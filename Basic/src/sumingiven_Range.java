public class sumingiven_Range {
    public static void main(String[] args) {
        Bruteforce();
        Formula();
        int a =5;
        int b =10;
        int sum = Recursion(0,a,b);
        System.out.println("The sum is "+sum);

    }

    static void Bruteforce() {
        int sum = 0;
        int a = 5;
        int b = 10;
        for (int i = a; i <= b; i++) {
            sum +=i;

        }
        System.out.println("The sum is "+sum);
    }
    static void Formula(){
        int n1 =5;
        int n2 =10;

        int  sum = n2*(n2+1)/2 - n1*(n1+1)/2 +n1;
        System.out.println("The sum is " + sum);

    }
    static int Recursion(int sum,int i , int b){

        if (i>b)return sum;
        return i+Recursion(sum, i+1,b);

    }
}
