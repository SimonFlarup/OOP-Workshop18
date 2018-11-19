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
public abstract class Actuator extends Unit {
    
    private int sensorValue = 0;
    
    public Actuator(String name) {
        super(name);
    }
    
    public int getsensorValue(){
        return this.sensorValue;
    }
    
    public void setSensorValue(int sensorValue){
        this.sensorValue = sensorValue;
    }
    
    @Override
    public abstract String toString();
    
}
