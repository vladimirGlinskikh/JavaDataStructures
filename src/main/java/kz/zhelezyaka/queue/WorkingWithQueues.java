package kz.zhelezyaka.queue;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Svetlana", 34));
        linkedList.add(new Person("Alexa", 23));
        linkedList.addFirst(new Person("Lybov", 38));

        final ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        System.out.println("-------------------------");

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Vladimir", 99));
        supermarket.add(new Person("Nikolay", 93));
        supermarket.add(new Person("Aleksey", 91));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    record Person(String name, int age) {

    }
}
