package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author timch15
 */
public class Building extends Unit {

    private final String address;
    private List<Actuator> actuatorList;
    private List<Sensor> sensorList;

    public Building(String name, String address) {
        super(name);
        this.address = address;
        this.actuatorList = new ArrayList<>();
        this.sensorList = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        sensorList.add(sensor);
    }

    public void removeSensor(UUID id) {
        for (int i = 0; i < sensorList.size(); i++) {
            if (id == sensorList.get(i).getUUID()) {
                sensorList.remove(i);
                return;
            }
        }
    }

    public void addAcuator(Actuator actuator) {
        actuatorList.add(actuator);
    }

    public void removeActuator(UUID id) {
        for (int i = 0; i < actuatorList.size(); i++) {
            if (id == actuatorList.get(i).getUUID()) {
                actuatorList.remove(i);
                return;
            }
        }
    }

    public String getAddress() {
        return address;
    }

    public List<Actuator> getActuatorList() {
        return actuatorList;
    }

    public List<Sensor> getSensorList() {
        return sensorList;
    }
    
    public List<Integer> getSensorData(){
        ArrayList<Integer> values = new ArrayList<>();
        
        for (Sensor sensor : sensorList){
            values.add(sensor.getValue());
        }
        
        return values;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + " Address: " + this.address;
    }

}
