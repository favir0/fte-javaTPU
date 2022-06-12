import java.util.Random;

public class AMVInterceptorFabric {
    public AMVInterceptor createVehicle(){
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
        //Interceptor
        String[] gunTypes = {"Heavy machine gun", "Light machine gun", "Medium machine gun", "Cannon", "Rockets", "Laser"};
        String gunType = gunTypes[rnd.nextInt(gunTypes.length)];
        int bulletsAmount = rnd.nextInt(3000);
        return new AMVInterceptor(crewSize, name, speed, airType, maxFlyHeight, gunType, bulletsAmount);
    }
}
