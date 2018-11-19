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
public abstract class Sensor extends Unit {

    private int value;

    public Sensor(String name) {
        super(name);
    }

    public abstract int getValue();

    @Override
    public abstract String toString();
}
