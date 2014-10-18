package dm;

import java.util.ArrayList;
 import java.util.List;
 /**
 * Created by user on 27.09.2014.
 */
public class Room {
    int tool; // макс количество
    int recorder;
    int editer;

    // Конструктор
    Room() {
        tool = 10;
        recorder = 5;
        editer = 2;
    }
    private List<Room> equipment = new ArrayList<Room>(tool);
    public List<Room> getEquipment()
    {
        return equipment;
    }

    public void setEquipment(List<Room> equipment)
    {
        this.equipment = equipment;
    }


    private List<Room> equipment1 = new ArrayList<Room>(recorder);
    public List<Room> getEquipment1()
    {
        return equipment1;
    }

    public void setEquipment1(List<Room> equipment1)
    {
        this.equipment1 = equipment1;
    }


    private List<Room> equipment2 = new ArrayList<Room>(editer);
    public List<Room> getEquipment2()
    {
        return equipment2;
    }

    public void setEquipment2(List<Room> equipment2)
    {
        this.equipment2 = equipment2;
    }
}
