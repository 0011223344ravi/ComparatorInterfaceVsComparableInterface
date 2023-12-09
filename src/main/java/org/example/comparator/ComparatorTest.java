package org.example.comparator;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorTest
{
    public static void main(String[] args) {
        List<Person> list  = Arrays.asList(
                new Person(25,"John"),
                new Person(26,"Rahul"),
                new Person(27,"Vivek"),
                new Person(28,"Akash"),
                new Person(23,"Z")
        );

        System.out.println(list);
        Collections.sort(list,new NameComparator());
        System.out.println(list);
    }
}
