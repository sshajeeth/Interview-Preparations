package StaticDemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        Scanner sc = new Scanner(System.in);

        StaticDemo.STATIC_VARIABLE = "a";
        StaticDemo.staticMethod();
        System.out.println(StaticDemo.STATIC_VARIABLE);
    }
}
