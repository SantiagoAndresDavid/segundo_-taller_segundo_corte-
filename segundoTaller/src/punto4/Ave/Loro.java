package punto4.Ave;

public class Loro extends Ave{
    private String region;
    private String color;

    public Loro(String sexo, int edad, String region, String color) {
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

    @Override
    public void hablar() {
        System.out.println("Hola, soy un loro y sé hablar");
    }
}
