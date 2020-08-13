import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {


        UseArrayList useArrayList  =  new UseArrayList();
        useArrayList.run();


        List<Person> people = Arrays.asList(
                new Person("John", "Does", 23),
                new Person("Williard", "Does", 23),
                new Person("Zara", "Does", 23),
                new Person("Albert", "Does", 23)
        );

//        Person person = new Person("john", "Does", 23);

        people.sort((Person p1, Person p2)-> p1.getFirstName().compareTo(p2.getFirstName()));


        System.out.println(people);
        
    }
}