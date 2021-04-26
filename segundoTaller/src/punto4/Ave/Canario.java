package punto4.Ave;

public class Canario extends Ave{
    private String region;
    private String color;

    public Canario(String sexo, int edad, String region, String color) {
        super(sexo, edad);
        this.region = region;
        this.color = color;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
