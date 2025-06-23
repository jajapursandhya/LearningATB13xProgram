package ex_11_While;

import java.util.Scanner;

public class Task_Typecasting {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter value a : " );
            int a = sc.nextInt();

            System.out.println("Enter value b : ");
            float b = sc.nextFloat();

            // Narrowing (Explicit)
            int total = a + (int) b;
            System.out.println("Narrowing (Explicit): " + total);

            // Widening (Implicit)
            float total2 = a + b;
            System.out.println("Widening (Implicit): " + total2);

            // Widening (Explicit)
            float total3 = (float) a + b;
            System.out.println("Widening (Explicit): " + total3);
    }
}
