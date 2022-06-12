public class GMVTank extends GroundMilitaryVehicle{

    private Integer gunCaliber;
    private Boolean hasActiveDefence;
    private Boolean hasDynamicDefence;

    public Integer getGunCaliber() {
        return gunCaliber;
    }

    public void setGunCaliber(Integer gunCaliber) {
        this.gunCaliber = gunCaliber;
    }

    public Boolean getHasActiveDefence() {
        return hasActiveDefence;
    }

    public void setHasActiveDefence(Boolean hasActiveDefence) {
        this.hasActiveDefence = hasActiveDefence;
    }

    public Boolean getHasDynamicDefence() {
        return hasDynamicDefence;
    }

    public void setHasDynamicDefence(Boolean hasDynamicDefence) {
        this.hasDynamicDefence = hasDynamicDefence;
    }

    public GMVTank(Integer crewSize, String name, Integer speed, Boolean protectFromBullets, Armor armor, Integer gunCaliber, Boolean hasActiveDefence, Boolean hasDynamicDefence) {
        super(crewSize, name, speed, protectFromBullets, armor);
        this.gunCaliber = gunCaliber;
        this.hasActiveDefence = hasActiveDefence;
        this.hasDynamicDefence = hasDynamicDefence;
    }

    @Override
    public String getDescription() {
        String tmpActiveDef = this.hasActiveDefence ? "true" : "false";
        String tmpDynamicDef = this.hasDynamicDefence ? "true" : "false";
        return super.getDescription()
                + "\n\t\t\tTank"
                + "\n\t\t\t\tGun caliber: " + this.gunCaliber.toString() + "mm;"
                + "\n\t\t\t\tHas active defence: " + tmpActiveDef + ";"
                + "\n\t\t\t\tHas dynamic defence: " + tmpDynamicDef + ";";
    }
}
