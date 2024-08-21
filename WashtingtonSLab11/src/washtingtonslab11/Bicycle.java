/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package washtingtonslab11;

/**
 *
 * @author S539941
 */
public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;
        

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    @Override
    public String toString(){
        return "Cadence: " + this.cadence +
                "\nGear: " + this.gear +
                "\nSpeed: " + this.speed;
    }
}
