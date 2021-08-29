package Inheritance;

public class Parent {
    private String private_variable = "Hello I am Private";
    public String publicVariable = "Hello I am Public";
    protected String protectedVariable = "Hello I am Protected";
    String defaultVariable = "Hello I am default";

    public void publicShow(){
        System.out.println("I am showing public method");
    }

    private void privateShow(){
        System.out.println("I am showing private method");
    }

    protected void protectedShow(){
        System.out.println("I am showing protected method");
    }

    void defaultShow(){
        System.out.println("I am showing default method");
    }

    public String getPrivate_variable() {
        return private_variable;
    }

    public void setPrivate_variable(String private_variable) {
        this.private_variable = private_variable;
    }
}
