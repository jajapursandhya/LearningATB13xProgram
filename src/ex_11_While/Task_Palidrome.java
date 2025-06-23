package ex_11_While;

import java.util.Scanner;
import java.lang.String;

public class Task_Palidrome {
    //Palindrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)
    public static void main(String[] args) {
//        int number = 24;
//        double Double = 23;
//        boolean Boolean = true;
//        char Ch = 'A';
//        System.out.println("Integer " + number);
//        System.out.println("Double "+ Double);
//        System.out.println("Boolean"+ Boolean);
//        System.out.println("Char" + Ch);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String input = sc.next();
        String output=Palindrome(input);
        if(input.equalsIgnoreCase(output)){
            System.out.println(input + " is a Palindrome");
        }
        else{
            System.out.println(input + " is not a Palindrome");
        }

    }
    public static String Palindrome(String ip){
        String output = "";
        for(int i= ip.length()-1;i>=0;i--){
            output += ip.charAt(i);
        }
        return output;
    }

}
