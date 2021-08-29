package Inheritance;

public class Main {

    public static void main(String[] args){
        Child c = new Child();

        System.out.println(c.publicVariable);
        System.out.println(c.defaultVariable);
        System.out.println(c.protectedVariable);

        c.publicShow();
        c.defaultShow();

        c.protectedShow();


//        Parent p1 = new Child();

    }
}
