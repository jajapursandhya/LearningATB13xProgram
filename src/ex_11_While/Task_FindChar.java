package ex_11_While;

import java.util.Scanner;
public class Task_FindChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char ch = sc.next().toLowerCase().charAt(0);
        if(ch== 'a'|| ch== 'e'|| ch== 'i'|| ch =='o'|| ch=='u'){
            System.out.println("Char " + ch + " is vowel");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Char " + ch + " is Consonant");
        } else{
            System.out.println("Invalid char entered");
        }
    }
}