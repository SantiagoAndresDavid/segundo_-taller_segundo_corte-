package punto4.Persona;

public class Alumno extends Persona {
    private String carrera;
    private int curso;

    public Alumno(String nombre, int edad, String carrera, int curso) {
        super(nombre, edad);
        this.carrera = carrera;
        this.curso = curso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Alumno y sé hablar");
    }
}
