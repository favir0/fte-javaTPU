public class GMVVehicle extends GroundMilitaryVehicle {

    private String vehicleType;
    private Integer wheelsAmount;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getWheelsAmount() {
        return wheelsAmount;
    }

    public void setWheelsAmount(Integer wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }

    public GMVVehicle(Integer crewSize, String name, Integer speed, Boolean protectFromBullets, GroundMilitaryVehicle.Armor armor, String vehicleType, Integer wheelsAmount) {
        super(crewSize, name, speed, protectFromBullets, armor);
        this.vehicleType = vehicleType;
        this.wheelsAmount = wheelsAmount;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + "\n\t\t\tVehicle"
                + "\n\t\t\t\tVehicle type: " + this.vehicleType + ";"
                + "\n\t\t\t\tAmount of wheels: " + this.wheelsAmount.toString() + ";";
    }
}
