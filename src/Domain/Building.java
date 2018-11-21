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

    public List<Integer> getTempSensorData() {
        ArrayList<Integer> values = new ArrayList<>();

        for (Sensor sensor : sensorList) {
            if (sensor instanceof TempSensor) {
                values.add(sensor.getValue());
            }
        }

        return values;
    }

    public List<Integer> getCo2SensorData() {
        ArrayList<Integer> values = new ArrayList<>();

        for (Sensor sensor : sensorList) {
            if (sensor instanceof CO2Sensor) {
                values.add(sensor.getValue());
            }
        }

        return values;
    }

    public void updateActuators() {
        int temp = 0;
        int co2 = 0;
        for (int num : getTempSensorData()) {
            temp += num;
        }

        for (int num : getCo2SensorData()) {
            co2 += num;
        }
        temp /= getTempSensorData().size();
        co2 /= getCo2SensorData().size();

        for (Actuator a : getActuatorList()) {
            if (a instanceof TempActuator) {
                a.setSensorValue(temp);
            } else if (a instanceof CO2Actuator) {
                a.setSensorValue(co2);
            }
        }
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + " Address: " + this.address;
    }

}
