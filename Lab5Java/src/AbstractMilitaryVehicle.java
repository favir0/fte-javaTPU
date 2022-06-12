public abstract class AbstractMilitaryVehicle implements MilitaryVehicle {
    private Integer crewSize;
    private String name;
    private Integer speed;

    public Integer getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(Integer crewSize) {
        this.crewSize = crewSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public AbstractMilitaryVehicle(Integer crewSize, String name, Integer speed) {
        this.crewSize = crewSize;
        this.name = name;
        this.speed = speed;
    }

    public String getDescription(){
        return "Description of " + this.name + ":"
                + "\n\tCrew size: " + this.crewSize.toString() + ";"
                + "\n\tSpeed: " + this.speed.toString() + " Kmph;";
    }
}
