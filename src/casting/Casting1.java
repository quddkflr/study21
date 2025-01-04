package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long lonValue;
        double doubleValue;

        lonValue = intValue; //int -> long
        System.out.println("lonValue = " + lonValue);

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; //long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
