package org.example.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

    public static void main(String[] args) {

        List<Person> list  = Arrays.asList(
                new Person(25,"John"),
                new Person(26,"Rahul"),
                new Person(27,"Vivek"),
                new Person(28,"Akash"),
                new Person(23,"Z")
        );
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //Stream Usage

        list.stream().sorted().forEach(System.out::println);

    }
}
