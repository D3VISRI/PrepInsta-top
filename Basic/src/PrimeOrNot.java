public class PrimeOrNot {
    public static void main(String[] args) {
        Iterative();
        breakConditon();
        nby2iteration();
        nroot2iteration();
    }
    static void Iterative(){
        int n = 5;
        int count = 0;
        if (n<2){
            System.out.println("The given number is not prime");
        }
        for (int i = 1; i <=n; i++) {
            if(n%i==0)
                count+=1;


        }
        if (count>2) System.out.println("not a prime");
        else System.out.println("the given number is a prime");
    }
    static void breakConditon(){
        int i, n =5;
        boolean isprime = true;

        if (n<3) isprime =false;
        else{
            for(i =2;i<n;i++){
                if (n%i==0){isprime=false;
                    break;}
            }
        }
        String result = isprime?"prime":"not prime";
        System.out.println(n +" -->" +result);


    }
    //    Optimization by n/2 iterations
// running loop till n is wasteful because for any number n the numbers in
// the range(n/2 + 1, n) won't be divisible anyways.
    static void nby2iteration(){
        int i, n =5;
        boolean isprime = true;

        if (n<3) isprime =false;
        else{
            for(i =2;i<n/2;i++){
                if (n%i==0){isprime=false;
                    break;}
            }


        }


        String result = isprime?"prime":"not prime";
        System.out.println(n +" -->" +result);


    }
    /*Now a and b can't be both greater than the square root of n,
       since then the product a * b would be greater than sqrt(n) * sqrt(n) = n.
       So in any factorization of n, at least one of the factors must be smaller
       than the square root of n, and if we can't find any factors less than or equal to
       the square root, n must be a prime.*/
    static void nroot2iteration(){
        int i, n =5;
        boolean isprime = true;

        if (n<3) isprime =false;
        else{
            for(i =2;i<=Math.sqrt(n);i++){
                if (n%i==0){isprime=false;
                    break;}
            }


        }


        String result = isprime?"prime":"not prime";
        System.out.println(n +" -->" +result);


    }

}

