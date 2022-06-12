import java.util.Random;

public class Main {
    public static void main(String[] args){
        MilitaryVehicle[] division = new MilitaryVehicle[5];
        for (int i = 0; i < 5; i++){
            division[i] = randopa();
        }
        for (int i = 0; i < 5; i++){
            System.out.println(division[i].getDescription());
        }
        

    }

    public static MilitaryVehicle randopa(){
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
        //Interceptor
        String[] gunTypes = {"Heavy machine gun", "Light machine gun", "Medium machine gun", "Cannon", "Rockets", "Laser"};
        String gunType = gunTypes[rnd.nextInt(gunTypes.length)];
        int bulletsAmount = rnd.nextInt(3000);
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
        //Vehicle
        String [] vehicleTypes = {"ZSU", "RSZO", "BTR", "BMP"};
        String vehicleType = vehicleTypes[rnd.nextInt(vehicleTypes.length)];
        int wheelsAmount = rnd.nextInt(10);
        int chooseType = rnd.nextInt(0,4);
        //Preparation phase
        MilitaryVehicle tmp;
        tmp = switch (chooseType) {
            case 0 -> new AMVBomber(crewSize, name, speed, airType, maxFlyHeight, bombAmount, bombPower, hasStealthModule);
            case 1 -> new AMVInterceptor(crewSize, name, speed, airType, maxFlyHeight, gunType, bulletsAmount);
            case 2 -> new GMVTank(crewSize, name, speed, protectFromBullets, armor, gunCaliber, hasActiveDefence, hasDynamicDefence);
            default -> new GMVVehicle(crewSize, name, speed, protectFromBullets, armor, vehicleType, wheelsAmount);
        };
        //Conflict phase
        chooseType = rnd.nextInt(0,4);
        tmp = switch (chooseType) {
            case 0 -> new DamageStatusDecorator(tmp);
            case 1 -> new UndamagedStatusDecorator(tmp);
            case 2 -> new DamageStatusDecorator(new UndamagedStatusDecorator(tmp));
            default -> tmp;
        };
        return tmp;
    }

}
