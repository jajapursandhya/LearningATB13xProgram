package ex_11_While;

import java.util.Scanner;

public class Task_boolean {
    // Use comparison operators (==, !=, <, >, <=, >=)
    //- Use logical operators (&&, ||, !)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a : " );
        int a = sc.nextInt();
        System.out.println("Enter value b : ");
        int b = sc.nextInt();
        //a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false
        System.out.println("a == b :" + (a==b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a < b :" + (a==b));
        System.out.println("(a > b) && (a > 0):" + ((a > b) && (a > 0)));
        System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));
        System.out.println("!(a > b) : " + !(a > b));


    }
}
