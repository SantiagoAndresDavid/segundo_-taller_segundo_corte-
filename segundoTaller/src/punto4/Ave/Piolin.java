package punto4.Ave;

public class Piolin extends Canario{
    private int numPeliculas;

    public Piolin(String sexo, int edad, String region, String color, int numPeliculas) {
        super(sexo, edad, region, color);
        this.numPeliculas = numPeliculas;
    }

    public int getNumPeliculas() {
        return numPeliculas;
    }

    public void setNumPeliculas(int numPeliculas) {
        this.numPeliculas = numPeliculas;
    }

    @Override
    public void hablar() {

    }
}
