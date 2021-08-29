package DataStructure.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        Person person1 = new Person("Shajeeth", 23, 68, 172);
        Person person2 = new Person("Ramiiyan", 23, 68, 172);
        Person person3 = new Person("Sajeban", 23, 68, 172);
        Person person4 = new Person("Vahkshshan", 23, 68, 172);


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(0,person4);

        System.out.println(persons);
    }
}
