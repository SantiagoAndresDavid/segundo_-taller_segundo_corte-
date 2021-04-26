package punto1;

public class Docente implements Trabajador {
    private int cantidadHoras;
    private  double salario;

    public Docente(int cantidadHoras, double salario) {
        this.cantidadHoras = cantidadHoras;
        this.salario = salario;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario(){
        salario = cantidadHoras * 120;
        return salario;
    }

    @Override
    public double calcularBonificacion() {
        double salarioBonificado = salario * 2;
        return salarioBonificado;
    }

    @Override
    public String toString() {
        return "Docente " +
                "\n--------------------------------------------------------------------"+
                "\n cantidadHoras: " + cantidadHoras +
                "\n salario: " + salario +
                "\n salario + bono: " + calcularBonificacion() +
                "\n--------------------------------------------------------------------";
    }
}



