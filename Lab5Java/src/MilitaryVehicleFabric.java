import java.util.Random;

public  class MilitaryVehicleFabric {
    public MilitaryVehicle createVehicle(){

        Random rnd = new Random();
        int chooseType = rnd.nextInt(0,4);
        //Preparation phase
        MilitaryVehicle vehicle;
        switch (chooseType) {
            case (0) -> {
                AMVBoomberFabric fabricVehicle = new AMVBoomberFabric();
                vehicle = fabricVehicle.createVehicle();
            }
            case (1) -> {
                AMVInterceptorFabric fabricVehicle = new AMVInterceptorFabric();
                vehicle = fabricVehicle.createVehicle();
            }
            case (2) -> {
                GMVTankFabric fabricVehicle = new GMVTankFabric();
                vehicle = fabricVehicle.createVehicle();
            }
            default -> {
                GMVVehicleFabric fabricVehicle = new GMVVehicleFabric();
                vehicle = fabricVehicle.createVehicle();
            }
        }
        chooseType = rnd.nextInt(0,3);
        vehicle = switch (chooseType) {
            case 0 -> new DamageStatusDecorator(vehicle);
            case 1 -> new UndamagedStatusDecorator(vehicle);
            case 2 -> new DamageStatusDecorator(new UndamagedStatusDecorator(vehicle));
            default -> vehicle;
        };
        return vehicle;
    }

}
