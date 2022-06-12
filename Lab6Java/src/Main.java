public class Main {
    public static void main(String[] args){
        MilitaryVehicle[] division = new MilitaryVehicle[5];
        for (int i = 0; i < 5; i++){
            if (i%2==0) {
                AbstractMVFactory veh = new UnatedNationsVehicleFactory();
                division[i] = veh.createVehicle();
            }
            else {
                AbstractMVFactory tank = new MoonRepublicTankFactory();
                division[i] = tank.createVehicle();
            }
        }
        for (int i = 0; i < 5; i++){
            System.out.println(division[i].getDescription());
        }
    }

}
