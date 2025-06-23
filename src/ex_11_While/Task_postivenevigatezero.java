package ex_11_While;

import java.util.Scanner;

public class Task_postivenevigatezero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value a : " );
        int a = sc.nextInt();
        if( a > 0)
        {
            System.out.println(a + " is postive");
        } else if (a < 0) {
            System.out.println(a + " is negative");
        }else{
            System.out.println(a + "is zero");
        }
    }
}
