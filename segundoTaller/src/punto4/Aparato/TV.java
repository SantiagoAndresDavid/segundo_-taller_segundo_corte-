package punto4.Aparato;

public class TV extends Aparato {
    private String teletexto;
    private int antiguedad;

    public TV() {

    }

    public TV(String consumo, int precio, String teletexto, int antiguedad) {
        super(consumo, precio);
        this.teletexto = teletexto;
        this.antiguedad = antiguedad;
    }

    public String getTeletexto() {
        return teletexto;
    }

    public void setTeletexto(String teletexto) {
        this.teletexto = teletexto;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy una TV y sé hablar");
    }
}