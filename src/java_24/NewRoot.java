package java_24;

import java.util.*;

class NewRoot {
    public static void main(String[] arguments){
        Random generator = new Random();
        int num = generator.nextInt();
        System.out.println(num);
        System.out.println("Квадратний корень из "
            + num
            + " равен "
            + Math.sqrt(num)
        );
    }
}