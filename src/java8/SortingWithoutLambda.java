package java8;

import java8.model.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithoutLambda {



    public static List<Developer> getDeveloers() {

        List<Developer> lists = new ArrayList<>();
        lists.add(new Developer("Sangha", new BigDecimal(70000), 29));
        lists.add(new Developer("Santosh", new BigDecimal(60000), 28));
        lists.add(new Developer("Monika", new BigDecimal(50000), 26));

        return lists;
    }

    public static void main(String[] args) {
         List<Developer> list = getDeveloers();

        System.out.println("Before sorting");

        for (Developer developer : list )
        {
            System.out.println(developer);
        }

        Collections.sort(list, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("After Sort ");

        for (Developer developer: list)
        {
            System.out.println(developer);
        }


        System.out.println("Sorting with Lambada");

        list.sort(new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o1.getName());
            }
        });
        list.forEach(developer -> System.out.println(developer));

        System.out.println("Sorting the age");
        list.sort((Developer d1, Developer d2)-> d1.getAge()- d2.getAge());
        list.forEach(developer -> System.out.println(developer));
        System.out.println("Sorting with Salary");
        list.sort((o1, o2)->o1.getSalary().compareTo(o2.getSalary()));
        list.forEach(developer -> System.out.println(developer));


    }
}
