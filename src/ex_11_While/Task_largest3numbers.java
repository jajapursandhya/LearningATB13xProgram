package ex_11_While;

import java.util.Scanner;

public class Task_largest3numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a : " );
        int a = sc.nextInt();
        System.out.println("Enter value b : " );
        int b = sc.nextInt();
        System.out.println("Enter value c : " );
        int c = sc.nextInt();
        int n = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println("Largest number is " + n);
    }
}
