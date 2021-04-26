package punto1;

public class TestTrabajador {
    public static void main(String[] args) {
        Coordinador coordinador1 = new Coordinador();
        Asistente asistente1 = new Asistente();
        Secretaria secretaria1 = new Secretaria();
        Docente docente1 = new Docente(30,120);

        System.out.println(docente1);
        System.out.println(asistente1);
        System.out.println(secretaria1);
        System.out.println(coordinador1);
    }
}
