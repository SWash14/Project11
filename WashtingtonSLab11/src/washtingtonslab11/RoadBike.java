/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package washtingtonslab11;

/**
 *
 * @author S539941
 */
public class RoadBike extends Bicycle{
    private String handlebarType;
    
    public RoadBike(String handlebars, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        this.handlebarType = handlebars;
    }
    
    public void setHandlebarType(String type){
        this.handlebarType = type;
    }
    
    public String toString(){
        return super.toString() +
                "\nHandelbars: " + this.handlebarType;
    }
}
