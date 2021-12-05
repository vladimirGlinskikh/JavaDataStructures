package kz.zhelezyaka.queue;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
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
