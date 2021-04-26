package punto1;

public class Coordinador implements Trabajador {
    private final static double salario = 5.000;

    @Override
    public double calcularBonificacion() {
        double salarioBonificado = salario * 2;
        return salarioBonificado;
    }

    @Override
    public String toString() {
        return "coordinador " +
                "\n--------------------------------------------------------------------" +
                "\nsalario: " + salario +
                "\n salario + bono: " + calcularBonificacion() +
                "\n--------------------------------------------------------------------";
    }
}
