public class AMVBomber extends AirMilitaryVehicle {

    private Integer bombAmount;
    private Integer bombPower;
    private Boolean hasStealthModule;

    public Integer getBombAmount() {
        return bombAmount;
    }

    public void setBombAmount(Integer bombAmount) {
        this.bombAmount = bombAmount;
    }

    public Integer getBombPower() {
        return bombPower;
    }

    public void setBombPower(Integer bombPower) {
        this.bombPower = bombPower;
    }

    public Boolean getHasStealthModule() {
        return hasStealthModule;
    }

    public void setHasStealthModule(Boolean hasStealthModule) {
        this.hasStealthModule = hasStealthModule;
    }

    public AMVBomber(Integer crewSize, String name, Integer speed, String type, Integer maxFlyHeight, Integer bombAmount, Integer bombPower, Boolean hasStealthModule) {
        super(crewSize, name, speed, type, maxFlyHeight);
        this.bombAmount = bombAmount;
        this.bombPower = bombPower;
        this.hasStealthModule = hasStealthModule;
    }

    @Override
    public String getDescription() {
        String tmp = this.hasStealthModule ? "true" : "false";
        return super.getDescription()
                + "\n\t\t\tBomber"
                + "\n\t\t\t\tAmount of bombs: " + this.bombAmount.toString() + ";"
                + "\n\t\t\t\tBombs power: " + this.bombPower.toString() + " J;"
                + "\n\t\t\t\tHas stealth module: " + tmp + ";";
    }
}
