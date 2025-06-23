package ex_11_While;
import java.util.*;
public class Task_iteration {
    // Show the difference between ++i and i++
    //- Show the difference between --i and i--
    //- Print values before and after operations
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a : " );
        int a = sc.nextInt();
        System.out.println("Original: " + a + "Pre-increment: "+ ++a);
        System.out.println("Original: " + a + "Post-increment: "+ a++);
        System.out.println("Original: " + a + "Pre-decrement: "+ --a);
        System.out.println("Original: " + a + "Post-decrement: "+ a--);

}
}
