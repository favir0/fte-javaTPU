import java.util.Random;

public class UnatedNationsVehicleFactory implements AbstractMVFactory{
    public GMVVehicle createVehicle(){
        Random rnd = new Random();
        // Abstract
        int crewSize = rnd.nextInt(5);
        int speed = rnd.nextInt(1000);
        String[] names = {"UN-T-9999", "UN-IL-SHTURMOVIK", "UN-OBJ-2916", "UN-IDK-123", "UN-FTE-14", "UN-KEKIS-02"};
        String name = names[rnd.nextInt(names.length)];
        //GroundVehicle
        Boolean protectFromBullets = rnd.nextBoolean();
        int frontalArm = rnd.nextInt(800);
        int sideArm = rnd.nextInt(500);
        int backArm = rnd.nextInt(300);
        GroundMilitaryVehicle.Armor armor = new GroundMilitaryVehicle.Armor(frontalArm, sideArm, backArm);
        //Vehicle
        String [] vehicleTypes = {"UN-ZSU", "UN-RSZO", "UN-BTR", "UN-BMP"};
        String vehicleType = vehicleTypes[rnd.nextInt(vehicleTypes.length)];
        int wheelsAmount = rnd.nextInt(10);
        int chooseType = rnd.nextInt(0,3);
        return new GMVVehicle(crewSize, name, speed, protectFromBullets, armor, vehicleType, wheelsAmount);
    }
}
