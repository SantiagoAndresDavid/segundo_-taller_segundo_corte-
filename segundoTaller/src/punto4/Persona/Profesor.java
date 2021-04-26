package punto4.Persona;

public class Profesor extends Persona {
    private String despacho;
    private String Email;

    public Profesor(String nombre, int edad, String despacho, String email) {
        super(nombre, edad);
        this.despacho = despacho;
        Email = email;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Profesor y sé hablar");
    }

}
