package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Task_TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1 a=");
        int a = scanner.nextInt();
        System.out.println("Enter side2 b=");
        int b = scanner.nextInt();
        System.out.println("Enter side3 c=");
        int c = scanner.nextInt();
        if(a == b && a == c){
            System.out.println("equilateral triangle.");
        } else if (a == b || b == c || a == c) {
            System.out.println("isosceles triangle");
        }
        else {
            System.out.println("scalene triangle");
        }
    }
}
