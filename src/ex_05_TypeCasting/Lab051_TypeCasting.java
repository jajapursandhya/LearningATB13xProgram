package ex_05_TypeCasting;

public class Lab051_TypeCasting {
    public static void main(String[] args) {
        long phone = 9676860450l;
//        short s = phone; // Implicit Narrow?
        short s1 = (short)phone; // Explicit Narrow?
    }
}
