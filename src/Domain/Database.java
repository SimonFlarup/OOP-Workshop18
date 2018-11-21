package Domain;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author timch15
 */
public class Database implements IBuildingManagementSystem {

    Map<UUID, Building> buildingInformation = new HashMap<>();
    Map<UUID, Sensor> sensorInformation = new HashMap<>();
    Map<UUID, Actuator> actuatorInformation = new HashMap<>();

    @Override
    public Map<UUID, Building> getBuildingInformation() {
        return buildingInformation;
    }

    @Override
    public Map<UUID, Sensor> getSensorInformation(UUID buildingId) {
        return sensorInformation;
    }

    @Override
    public Map<UUID, Actuator> getActuatorInformation(UUID buildingId) {
        return actuatorInformation;
    }

    @Override
    public UUID addBuilding(String name, String address) {
        Building building = new Building(name, address);
        return building.getUUID();
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        TempSensor tempSensor = new TempSensor(name);
        buildingInformation.get(buildingId).addSensor(tempSensor);
        return tempSensor.getUUID();
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        CO2Sensor cO2Sensor = new CO2Sensor(name);
        buildingInformation.get(buildingId).addSensor(cO2Sensor);
        return cO2Sensor.getUUID();
    }

    @Override
    public void removeBuilding(UUID buildingId){
        buildingInformation.remove(buildingId);
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        buildingInformation.get(buildingId).removeSensor(sensorId);
    }

    @Override
    public UUID addTempActuator(UUID buildingId, String name, int targetTemp) {
        TempActuator tempActuator = new TempActuator(name, targetTemp);
        buildingInformation.get(buildingId).addAcuator(tempActuator);
        return tempActuator.getUUID();
    }

    @Override
    public UUID addCo2Actuator(UUID buildingId, String name, int targetPPM) {
        CO2Actuator cO2Actuator = new CO2Actuator(name, targetPPM);
        buildingInformation.get(buildingId).addAcuator(cO2Actuator);
        return cO2Actuator.getUUID();
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        buildingInformation.get(buildingId).removeActuator(actuatorId);
    }
}
