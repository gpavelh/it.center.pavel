package Lesson06.Ex1;

import Lesson06.Ex1.Person;
import Lesson06.Ex1.PersonSuperComporator;

import java.util.*;

public class Lesson06Ex1 {


        public static void main(String[] args) {
            Person[] list = new Person[4];
            list[0] = new Person("Nora",5);
            list[1] = new Person("Bita", 2);
            list[2] = new Person("Al9",4);
            list[3] = new Person("Al9",1);
            Arrays.sort(list, new PersonSuperComporator().reversed());
            System.out.println("Соритровка по Имени");
            for (Person s: list
                 ) {
                System.out.println(s.toString());
            }
        }
}
