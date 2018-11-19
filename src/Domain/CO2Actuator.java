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
public class CO2Actuator extends Actuator {

    private int targetPPM;

    public CO2Actuator(String name, int targetPPM) {
        super(name);
        this.targetPPM = targetPPM;
    }

    @Override
    public String toString() {
        return ("Name: " + super.getName() + " UUID: " + super.getUUID() + " Target PPM: " + this.targetPPM);
    }

}
