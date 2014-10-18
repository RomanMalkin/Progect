package dm;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by user on 27.09.2014.
 */
public class Person {
    int a = 4;
    private List<Person> persons = new ArrayList<Person>(a);

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

}
