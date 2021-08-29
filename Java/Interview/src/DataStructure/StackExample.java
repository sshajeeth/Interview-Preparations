package DataStructure;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack stack = new Stack();

        for(int i=0; i<=10; i++){
            stack.push(i);
        }
        System.out.println(stack);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());

        }
    }
}
