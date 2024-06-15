public class Greatestof2 {
    public static void main(String[] args) {
        ifelse();
        Ternary();
        MathFunction();
    }
    static void  ifelse(){
        int a = 4;
        int b = 5;
        if (a==b){
            System.out.println("equal");
        } else if (a>b) {
            System.out.println("A is greatest");

        }
        else
            System.out.println(b);


    }
    static void Ternary(){
        int a = 4;
        int b = 5;
        int temp;
        if (a==b) System.out.println("Equal");
        else {
            temp = a>b?a:b;
            System.out.println(temp + " is Greatest");
        }
    }
    static void MathFunction(){
        int a = 4;
        int b = 5;
        if (a==b) System.out.println("Equal");
        else System.out.println(Math.max(a,b)+ " Greatest");

    }
}
