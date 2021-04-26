package punto1;

public class Secretaria implements Trabajador{
    private final static double salario = 3.000;
    @Override
    public double calcularBonificacion() {
        double salarioBonificado = salario * 2;
        return salarioBonificado;
    }

    @Override
    public String toString() {
        return "Secretaria " +
                "\n--------------------------------------------------------------------"+
                "\nsalario: " + salario +
                "\nsalario + bono: " + calcularBonificacion() +
                "\n--------------------------------------------------------------------";
    }
}
