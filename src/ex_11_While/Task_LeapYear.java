package ex_11_While;
import java.util.*;

public class Task_LeapYear {
    public static void main(String[] arg){
        /*Create a program that determines whether a given year is a leap year.
         A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
         Use an if-else statement to make this determination.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        int Leapyear = sc.nextInt();
        if (Leapyear % 4 == 0){
            System.out.println(Leapyear + " is Leap year");
        }
        else {
            System.out.println(Leapyear + " is not Leap year");
        }
    }
}
