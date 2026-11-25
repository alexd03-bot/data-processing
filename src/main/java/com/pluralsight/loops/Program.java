package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Jeremy", "Fitzgerald", 25));
        people.add(new Person("Ella", "Fitzgerald", 30));
        people.add(new Person("Jeremy", "Johnson", 20));
        people.add(new Person("William", "Afton", 40));
        people.add(new Person("J'onn", "J'onzz", 31));
        people.add(new Person("Remmy", "Ma", 42));
        people.add(new Person("Bruce", "Wayne", 26));
        people.add(new Person("Thomas", "Wayne", 37));
        people.add(new Person("Martha", "Wayne", 35));
        people.add(new Person("Henry", "Emily", 32));

        List<Person> lastNameMatch = new ArrayList<>();
        String lastNameSearch = "Wayne";
        for(Person p : people) {
            if (p.getLastName().equals(lastNameSearch))
                lastNameMatch.add(p);

        }
        System.out.println(lastNameMatch.toString());

    }
}
