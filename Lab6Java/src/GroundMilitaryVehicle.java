public abstract class GroundMilitaryVehicle extends AbstractMilitaryVehicle{
    public GroundMilitaryVehicle(Integer crewSize, String name, Integer speed, Boolean protectFromBullets, Armor armor) {
        super(crewSize, name, speed, protectFromBullets, armor);
    }
    @Override
    public String getDescription() {
        return super.getDescription()
                + "\n---Ground Military Vehicle model---";
    }
}