/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package washtingtonslab11;
import java.util.*;
/**
 *
 * @author S539941
 */
public class WashtingtonSLab11 {

    /**
     * Author: Semaja Washington
     * @param args
     */
    public static void main(String[] args) {
        Bicycle b1 = new MountainBike(28,43,3,2);
        Bicycle b2 = new TandemBike(12,37,2,1);
        Bicycle b3 = new RoadBike("flat",40,1,1);
        Bicycle b4 = new RoadBike("dipped",38,1,2);
        Bicycle b5 = new TandemBike(14,35,3,3);
        Bicycle b6 = new MountainBike(32,44,2,2);
        Bicycle b7 = new RoadBike("flat",45,4,2);
        Bicycle b8 = new MountainBike(36,48,1,2);
        Bicycle b9 = new TandemBike(18,27,3,1);
        Bicycle b10 = new RoadBike("flat",56,5,3);
        
  
        // Semaja Washington 4/4/2022
        
        //2. Created an ArrayList here and added Bicycles
        ArrayList<Bicycle> myBikes = new ArrayList<>();
        myBikes.add(b1);
        myBikes.add(b2);
        myBikes.add(b3);
        myBikes.add(b4);
        myBikes.add(b5);
        myBikes.add(b6);
        myBikes.add(b7);
        myBikes.add(b8);
        myBikes.add(b9);
        myBikes.add(b10);
        
        //3. Looping through Bicycles, make changes, print
        for(Bicycle y : myBikes){
            if(y instanceof MountainBike mountainBike){
                mountainBike.setHeight(99);
                System.out.println("New Mountain Bike Info:");
            }
            if(y instanceof TandemBike tandemBike){
                tandemBike.setBetweenSpace(88);
                System.out.println("New Tandem Bike Info:");
            }
            if(y instanceof RoadBike roadBike){
                roadBike.setHandlebarType("New Type");
                System.out.println("New Road Bike Info:");
            }
            System.out.println(y);
            System.out.println("");
        }
    }
    
}
