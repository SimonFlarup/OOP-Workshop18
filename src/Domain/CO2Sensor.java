/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author askel
 */
public class CO2Sensor extends Sensor {

    public CO2Sensor(String name) {
        super(name);
    }

    @Override
    public int getValue() {
        return (int) (Math.random() * 100);
    }

    @Override
    public String toString() {
        return "Name = " + super.getName() + " Id = " + super.getUUID() + " Value = " + this.getValue();
    }

}
