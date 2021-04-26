package punto4.Ave;

import punto4.Hablador;

public class Ave implements Hablador {
    public String sexo;
    public int edad;

    public Ave(){

    }


    public Ave(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void hablar() {

    }
}
