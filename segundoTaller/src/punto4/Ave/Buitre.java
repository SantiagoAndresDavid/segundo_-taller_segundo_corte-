package punto4.Ave;

public class Buitre extends Ave {
    private String velocidadVuelo;
    private int peso;


    public Buitre(String sexo, int edad, String velocidadVuelo, int peso) {
        super(sexo, edad);
        this.velocidadVuelo = velocidadVuelo;
        this.peso = peso;
    }

    public String getVelocidadVuelo() {
        return velocidadVuelo;
    }

    public void setVelocidadVuelo(String velocidadVuelo) {
        this.velocidadVuelo = velocidadVuelo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
