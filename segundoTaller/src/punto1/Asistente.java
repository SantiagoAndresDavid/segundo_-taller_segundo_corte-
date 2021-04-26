package punto1;

public class Asistente implements Trabajador{
    private final static double salario = 4.000;
    @Override
    public double calcularBonificacion() {
        double salarioBonificado = salario * 2;
        return salarioBonificado;
    }

    @Override
    public String toString() {
        return "asistente " +
                "\n--------------------------------------------------------------------"+
                "\nsalario: " + salario +
                "\n salario + bono: " + calcularBonificacion() +
                "\n--------------------------------------------------------------------";
    }
}
