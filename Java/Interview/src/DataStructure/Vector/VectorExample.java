package DataStructure.Vector;

import DataStructure.ArrayList.Person;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        DataStructure.ArrayList.Person person1 = new DataStructure.ArrayList.Person("Shajeeth", 23, 68, 172);
        DataStructure.ArrayList.Person person2 = new DataStructure.ArrayList.Person("Ramiiyan", 23, 68, 172);
        DataStructure.ArrayList.Person person3 = new DataStructure.ArrayList.Person("Sajeban", 23, 68, 172);
        DataStructure.ArrayList.Person person4 = new Person("Vahkshshan", 23, 68, 172);

        Vector persons = new Vector();

        persons.add(person1);
        persons.add(1,person2);

        System.out.println(persons);
    }
}
