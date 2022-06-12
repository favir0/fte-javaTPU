public abstract class AbstractMilitaryVehicle implements MilitaryVehicle {
    private Integer crewSize;
    private String name;
    private Integer speed;

    private Boolean protectFromBullets;
    private Armor armor;

    public static class Armor{
        private Integer frontal;
        private Integer side;
        private Integer back;

        public Armor(Integer frontal, Integer side, Integer back) {
            this.frontal = frontal;
            this.side = side;
            this.back = back;
        }

        public Integer getFrontal() {
            return frontal;
        }

        public void setFrontal(Integer frontal) {
            this.frontal = frontal;
        }

        public Integer getSide() {
            return side;
        }

        public void setSide(Integer side) {
            this.side = side;
        }

        public Integer getBack() {
            return back;
        }

        public void setBack(Integer back) {
            this.back = back;
        }
    }

    public Boolean getProtectFromBullets() {
        return protectFromBullets;
    }

    public void setProtectFromBullets(Boolean protectFromBullets) {
        this.protectFromBullets = protectFromBullets;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

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

    public AbstractMilitaryVehicle(Integer crewSize, String name, Integer speed, Boolean protectFromBullets, Armor armor) {
        this.crewSize = crewSize;
        this.name = name;
        this.speed = speed;
        this.protectFromBullets = protectFromBullets;
        this.armor = armor;
    }

    public String getDescription(){
        String tmp = this.protectFromBullets ? "true" : "false";
        return "Description of " + this.name + ":"
                + "\n\tCrew size: " + this.crewSize.toString() + ";"
                + "\n\tSpeed: " + this.speed.toString() + " Kmph;"
                + "\n\tProtected from bullets: " + tmp + ";"
                + "\n\tArmor: " + this.armor.frontal.toString() + " mm frontal; " + this.armor.frontal.toString() + " mm side; " + this.armor.frontal.toString() + " mm back;";
    }
}
