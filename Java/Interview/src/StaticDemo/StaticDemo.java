package StaticDemo;

public class StaticDemo {
    static String STATIC_VARIABLE = "Static Variable";
    int x = 0;
    static void staticMethod(){
        System.out.println("I am Static Method");
    }

     static {
        System.out.println("I am Static Block");
    }

    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();

    }

//    public static String getStaticVariable() {
//        return STATIC_VARIABLE;
//    }
//
//    public static void setStaticVariable(String staticVariable) {
//        STATIC_VARIABLE = staticVariable;
//    }

//    directly accessing

}
