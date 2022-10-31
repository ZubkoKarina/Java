package java_24;

public class Changer {
    public static void main(String[] arguments) {
        if (arguments.length > 0) {
            System.out.println("The original value: "
                + arguments[0]);
            Float num1 = Float.valueOf(arguments[0]);
            float num2 = num1;
            int num3 = (int) num2;
            System.out.println("The final value: " + num3);
        }
    }
}
