public class GroundMilitaryVehicle extends AbstractMilitaryVehicle{

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

    private Boolean protectFromBullets;
    private Armor armor;

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

    public GroundMilitaryVehicle(Integer crewSize, String name, Integer speed, Boolean protectFromBullets, Armor armor) {
        super(crewSize, name, speed);
        this.protectFromBullets = protectFromBullets;
        this.armor = armor;
    }

    @Override
    public String getDescription() {
        String tmp = this.protectFromBullets ? "true" : "false";
        return super.getDescription()
                + "\n\t\tProtected from bullets: " + tmp + ";"
                + "\n\t\tArmor: " + this.armor.frontal.toString() + " mm frontal; " + this.armor.frontal.toString() + " mm side; " + this.armor.frontal.toString() + " mm back;";
    }
}
