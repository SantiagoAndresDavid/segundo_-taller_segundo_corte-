package punto4.Aparato;

public class Radio extends Aparato {
    private String casste;
    private String potencia;

    public Radio(String consumo, int precio, String casste, String potencia) {
        super(consumo, precio);
        this.casste = casste;
        this.potencia = potencia;
    }

    public String getCasste() {
        return casste;
    }

    public void setCasste(String casste) {
        this.casste = casste;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    @Override
    public void hablar() {
        System.out.println( "Hola, soy un Radio y sé hablar");
    }
}
