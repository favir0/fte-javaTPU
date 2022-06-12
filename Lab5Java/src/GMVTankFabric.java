import java.util.Random;

public class GMVTankFabric extends MilitaryVehicleFabric{
    public GMVTank createVehicle() {
        Random rnd = new Random();
        // Abstract
        int crewSize = rnd.nextInt(5);
        int speed = rnd.nextInt(1000);
        String[] names = {"T-9999", "IL-SHTURMOVIK", "OBJ-2916", "IDK-123", "FTE-14", "KEKIS-02"};
        String name = names[rnd.nextInt(names.length)];
        //GroundVehicle
        Boolean protectFromBullets = rnd.nextBoolean();
        int frontalArm = rnd.nextInt(800);
        int sideArm = rnd.nextInt(500);
        int backArm = rnd.nextInt(300);
        GroundMilitaryVehicle.Armor armor = new GroundMilitaryVehicle.Armor(frontalArm, sideArm, backArm);
        //Tank
        int gunCaliber = rnd.nextInt(300);
        Boolean hasActiveDefence = rnd.nextBoolean();
        Boolean hasDynamicDefence = rnd.nextBoolean();
        return new GMVTank(crewSize, name, speed, protectFromBullets, armor, gunCaliber, hasActiveDefence, hasDynamicDefence);
    }
}
