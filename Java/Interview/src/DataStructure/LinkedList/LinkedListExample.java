package DataStructure.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

//    Access to the elements linearly
public static void main(String[] args) {

    LinkedList districts = new LinkedList();
    districts.add("Vavuniya");
//    Vavuniya points to Mannar
    districts.add("Mannar");
//    Mannar Points to Colombo
    districts.add("Colombo");
//    Colombo points to Jaffna
    districts.add("Jaffna");
//    Jaffna points to null because in LinkedList always the last item points to null


//    System.out.println(districts);

//    add element on the first of the linkedlist
    districts.addFirst("Trincomalee");
//    System.out.println(districts);

//    add element on the last of the Linkedlist
    districts.addLast("Galle");
    districts.addLast("Kilinochi");
    System.out.println(districts);

//    finding the first element of the linkedlist
//    System.out.println(districts.getFirst());
//
//    //    finding the last element of the linkedlist
//    System.out.println(districts.getLast());



//    print linkedlist from backward

    String x = "Vavuniya";
    String y = "Galle";
    
    int x1 = districts.indexOf(x);
    int y1 = districts.indexOf(y);
//    System.out.println(x1);
    ListIterator iterator = districts.listIterator(y1+1);
    while (iterator.hasPrevious()) {
        System.out.printf("Index %d: Value %s\n", iterator.previousIndex(), iterator.previous());
        iterator.set("Kalivanchikudi");
        if (iterator.previousIndex() == (x1 - 1)) {
            break;
        }

    }
    System.out.println(districts);
    System.out.println(iterator);
//        System.out.println(iterator.previous());

//        System.out.println("From Front");
//        System.out.println(iterator.previousIndex());
    }
}

