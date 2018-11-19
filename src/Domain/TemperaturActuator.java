/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author simon
 */
public class TemperaturActuator extends Actuator {
    
    private int targetTemp; 
    
    public TemperaturActuator(String name, int targetTemp) {
        super(name);
        this.targetTemp = targetTemp;
    }

    @Override
    public String toString() {
        
        return ("Name: " + super.getName() + " UUID: " + super.getUUID() + " Target Temp: " + this.targetTemp);
    }
    
}
