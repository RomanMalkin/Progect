package dm;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by user on 27.09.2014.
 */
public class Person {

    int id;
    String name;
    String surname;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }
}
