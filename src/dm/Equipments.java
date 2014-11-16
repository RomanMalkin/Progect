package dm;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by user on 27.09.2014.
 */
public class Equipments {
    int tool; // макс количество
    int recorder;
    int editer;

    // Конструктор
    Equipments() {
        tool = 10;
        recorder = 5;
        editer = 2;
    }
    private List<Equipments> equipment = new ArrayList<Equipments>(tool);
    public List<Equipments> getEquipment()
    {
        return equipment;
    }

    public void setEquipment(List<Equipments> equipment)
    {
        this.equipment = equipment;
    }


    private List<Equipments> equipment1 = new ArrayList<Equipments>(recorder);
    public List<Equipments> getEquipment1()
    {
        return equipment1;
    }

    public void setEquipment1(List<Equipments> equipment1)
    {
        this.equipment1 = equipment1;
    }


    private List<Equipments> equipment2 = new ArrayList<Equipments>(editer);
    public List<Equipments> getEquipment2()
    {
        return equipment2;
    }

    public void setEquipment2(List<Equipments> equipment2)
    {
        this.equipment2 = equipment2;
    }
}