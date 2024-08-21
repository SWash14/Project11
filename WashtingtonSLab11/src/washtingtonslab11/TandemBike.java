/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package washtingtonslab11;

/**
 *
 * @author S539941
 */
public class TandemBike extends Bicycle{
    private int betweenSpace;
    
    public TandemBike(int betweenSpace, int startCadence,int startSpeed,
            int startGear) {
        super(startCadence, startSpeed, startGear);
        this.betweenSpace = betweenSpace;
    }
    
    public void setBetweenSpace(int newSpace){
        this.betweenSpace = newSpace;
    }
    
    public String toString(){
        return super.toString() +
                "\nBetween Space: " + this.betweenSpace;
    }
}
