
package Domain;


/**
 *
 * @author simon
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IBuildingManagementSystem bms = new Database();
        
        Building b1 = new Building("MMMI","Vej");
        
        Sensor s1 = new TempSensor("Temp");
        Actuator a1 = new TempActuator("Temp", 22);
        
        
        b1.addAcuator(a1);
        b1.addSensor(s1);
        
        System.out.println(b1);
        System.out.println(b1.getActuatorList().get(0));
        System.out.println(b1.getSensorList().get(0));
        
        Building b2 = new Building("Tek","Vej2");
        
        Sensor s2 = new TempSensor("Temp");
        Sensor s3 = new TempSensor("Temp");
        Sensor s4 = new CO2Sensor("CO2");
        Actuator a2 = new TempActuator("Temp", 22);
        
        
        b2.addAcuator(a2);
        b2.addSensor(s2);
        b2.addSensor(s3);
        b2.addSensor(s4);
        
        System.out.println(b2);
        System.out.println(b2.getActuatorList().get(0));
        System.out.println(b2.getSensorList().get(0));
        
        System.out.println(b2.getTempSensorData());
    }
    
}
