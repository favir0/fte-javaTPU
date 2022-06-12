public class AMVInterceptor extends AirMilitaryVehicle{
    private String gunType;
    private Integer bulletsAmount;

    public String getGunType() {
        return gunType;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType;
    }

    public Integer getBulletsAmount() {
        return bulletsAmount;
    }

    public void setBulletsAmount(Integer bulletsAmount) {
        this.bulletsAmount = bulletsAmount;
    }

    public AMVInterceptor(Integer crewSize, String name, Integer speed, String type, Integer maxFlyHeight, String gunType, Integer bulletsAmount) {
        super(crewSize, name, speed, type, maxFlyHeight);
        this.gunType = gunType;
        this.bulletsAmount = bulletsAmount;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + "\n\t\t\tInterceptor"
                + "\n\t\t\t\tGun type: " + this.gunType + ";"
                + "\n\t\t\t\tAmount of bullets: " + this.bulletsAmount.toString() + ";";
    }
}
