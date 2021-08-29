package DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {
    public static void main(String[] args) {
//        ======Queue is abstract cant be instantiated====
//        LinkedList<Integer> linkedList = new Queue<Integer>();
//        Queue<Stack> linkedList = new LinkedList<Stack>();
//        Queue<Stack> q = new Queue;

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<=10; i++){
            queue.add(i);
        }

        System.out.println(queue);


//        Remove
//        remove the top element. if the queue is empty then throw an error
        System.out.println(queue.remove());

        System.out.println(queue);

//        get first element
        System.out.println(queue.peek());

//        Remove
        //        remove the top element. if the queue is empty then return null
        System.out.println(queue.poll());
    }
}
