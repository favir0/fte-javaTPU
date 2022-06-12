import java.util.Random;

public class Main {
    public static void main(String[] args){
        MilitaryVehicle[] division = new MilitaryVehicle[5];
        for (int i = 0; i < 5; i++){
            MilitaryVehicleFabric vehFab = new MilitaryVehicleFabric();
            division[i] = vehFab.createVehicle();
            //division[i] = new AMVBoomberFabric().createVehicle();
        }
        for (int i = 0; i < 5; i++){
            System.out.println(division[i].getDescription());
        }

    }

}
