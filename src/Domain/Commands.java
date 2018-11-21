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
public enum Commands{
    
    ADD("add"),
    REMOVE("remove"),
    GET("get"),
    SET("set");
    
    private String commandString;
    
    Commands(String commandString){
        this.commandString = commandString;
    }
    
    @Override
    public String toString(){
        return commandString;
    }
}
