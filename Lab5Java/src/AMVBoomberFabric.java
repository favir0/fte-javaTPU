import java.util.Random;

public class AMVBoomberFabric extends MilitaryVehicleFabric{
    public AMVBomber createVehicle(){
        Random rnd = new Random();
        // Abstract
        int crewSize = rnd.nextInt(5);
        int speed = rnd.nextInt(1000);
        String[] names = {"T-9999", "IL-SHTURMOVIK", "OBJ-2916", "IDK-123", "FTE-14", "KEKIS-02"};
        String name = names[rnd.nextInt(names.length)];
        // AirVehicle
        String[] airTypes = {"strategic", "tactical", "general purpose"};
        String airType = airTypes[rnd.nextInt(airTypes.length)];
        int maxFlyHeight = rnd.nextInt(1500);
        //Bomber
        int bombAmount = rnd.nextInt(20);
        int bombPower = rnd.nextInt(2000);
        Boolean hasStealthModule =  rnd.nextBoolean();
        return new AMVBomber(crewSize, name, speed, airType, maxFlyHeight, bombAmount, bombPower, hasStealthModule);
    }
}
