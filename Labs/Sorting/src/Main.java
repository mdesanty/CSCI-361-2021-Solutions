import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main 
{
    public static void main(String[] args)
    {
        Main main = new Main();
        main.testSorting();
    }

    private void testSorting()
    {
        List<Person> people = new ArrayList<Person>();

        Person randy = new Person("Randy", 21);
        people.add(randy);

        Person pete = new Person("Pete", 12);
        people.add(pete);

        Person dan = new Person("Dan", 18);
        people.add(dan);

        System.out.println(people);
        // [Randy (21), Pete (12), Dan (18)]

        Collections.sort(people);
        System.out.println(people);
        // [Pete (12), Dan (18), Randy (21)]

        Collections.sort(people,
            new Comparator<Person>()
            {
                @Override
                public int compare(Person personA, Person personB)
                {
                    int comparison = personA.getName().compareTo(personB.getName());

                    if(comparison < 0)
                        return -1;
                    else if(comparison > 0)
                        return 1;
                    else
                        return 0;
                }
            }
        );
        System.out.println(people);
        // [Dan (18), Pete (12), Randy (21)]

        Collections.sort(people,
            (Person personA, Person personB) ->
            {
                int comparison = personA.getName().compareTo(personB.getName());

                if(comparison > 0)
                    return -1;
                else if(comparison < 0)
                    return 1;
                else
                    return 0;
            }
        );
        // [Randy (21), Pete (12), Dan (18)]
    }    
}