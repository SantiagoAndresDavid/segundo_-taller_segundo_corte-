package punto4.Persona;

public class Bedel extends Persona {
    private int turno;
    private int antiguedad;

    public Bedel(String nombre, int edad, int turno, int antiguedad) {
        super(nombre, edad);
        this.turno = turno;
        this.antiguedad = antiguedad;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Bedel y sé hablar");
    }
}
