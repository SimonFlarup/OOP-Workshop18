/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.UUID;

/**
 *
 * @author askel
 */
public abstract class Unit {

    private final UUID id;
    private String name;

    public Unit(String name) {

        this.name = name;
        this.id = UUID.randomUUID();
    }

    public UUID getUUID() {

        return this.id;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public abstract String toString();

}
