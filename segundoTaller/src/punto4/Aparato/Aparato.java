package punto4.Aparato;

import punto4.Hablador;

public class Aparato implements Hablador {
    public String consumo;
    public int precio;

    public Aparato() {

    }

    public Aparato(String consumo, int precio) {
        this.consumo = consumo;
        this.precio = precio;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void hablar() {

    }
}
