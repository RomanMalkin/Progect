package dm;

import java.util.ArrayList;
 import java.util.List;
 /**
 * Created by user on 27.09.2014.
 */
public class Equipment
 {

     Equipments eqs = new Equipments();
     int id;
     String name;
     int amount;
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
     public void setAmount(int amount){
         this.amount = amount;
     }
     public int getAmount(){
         return amount;
     }
 }