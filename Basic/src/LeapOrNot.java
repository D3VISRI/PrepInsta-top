public class LeapOrNot {
    public static void main(String[] args) {
        ifelse();
        Ternary();
    }
    //The year must be divisible by 400
    //the year must he divisible by 4 but not 100
    static void ifelse(){
        int year = 2014;
        if(year%4 ==0 && year%100!=0)
            System.out.println("Leap");
        else if (year%400 ==0) {
            System.out.println("Leap");

        }else System.out.println(" not a leap year");
    }
    static void Ternary(){
        int year = 2020;
        int temp ;
        temp = (year%400==0) || (year%4==0 && year%100!=0) ? 1 : 0;
        if (temp == 1) System.out.println(year +" cleap");
        else System.out.println("not leap");

    }
}