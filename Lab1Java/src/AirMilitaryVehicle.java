public class AirMilitaryVehicle extends AbstractMilitaryVehicle {

    private String airType;
    private Integer maxFlyHeight;

    public String getType() {
        return airType;
    }

    public void setType(String type) {
        this.airType = type;
    }

    public Integer getMaxFlyHeight() {
        return maxFlyHeight;
    }

    public void setMaxFlyHeight(Integer maxFlyHeight) {
        this.maxFlyHeight = maxFlyHeight;
    }

    public AirMilitaryVehicle(Integer crewSize, String name, Integer speed, String type, Integer maxFlyHeight) {
        super(crewSize, name, speed);
        this.airType = type;
        this.maxFlyHeight = maxFlyHeight;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + "\n\t\tType of aircraft: " + this.airType + ";"
                + "\n\t\tMaximum fly height: " + this.maxFlyHeight.toString() + " Km;";
    }
}
