package dm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 03.11.2014.
 */
public class PersonList
{
    int a = 4; // макс кол-во людей
    public List<Person> persons = new ArrayList<Person>(a);

    public Person getPerson(int number_person)
    {
        return persons.get(number_person);
    }

    public Person getPersonID(int id_person)
    {
        Person temp=new Person();
        for(Person p:persons){
            if(p.id == id_person) { temp = p; }
        }
        if(temp.name != null)
        {
            return temp;
        }
        else
        {
            throw new NullPointerException("Такой персоны не существует");
        }

    }

    public void setPerson(Person person, int id_position) {
        persons.set(id_position, person);
    }

    public void AddPerson(Person pr)
    {
        persons.add(pr);
    }

    public void RemovePerson(int number_person)
    {
        persons.remove(number_person);
    }

    public void ClearPersonsList()
    {
        persons.clear();
    }
}
