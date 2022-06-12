public class OptionDecorator implements MilitaryVehicle {
    private MilitaryVehicle mv;
    private Integer crewSize;
    private String name;
    private Integer speed;
    private String status;


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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OptionDecorator(MilitaryVehicle mv, String status) {
        this.mv = mv;
        this.status = status;
    }

    @Override
    public String getDescription() {
        return mv.getDescription()
                + "\n\t---Status - " + this.status + "---";
    }
}

