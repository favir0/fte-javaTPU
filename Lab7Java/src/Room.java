public class Room {
    private String type;
    private Integer area;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Room(String type, Integer area) {
        this.type = type;
        this.area = area;
    }
}
