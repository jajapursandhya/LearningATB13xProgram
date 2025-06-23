package ex_11_While;
import java.util.*;
public class Task_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a : " );
        int a = sc.nextInt();
        System.out.println("Enter value b : ");
        int b = sc.nextInt();
        //Use +, -, *, /, % operators
        System.out.println("Addition : " + a+b);
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication : " + a*b);
        System.out.println("Division : " + a/b);
        System.out.println("Modulus : " + a%b);

    }
}
