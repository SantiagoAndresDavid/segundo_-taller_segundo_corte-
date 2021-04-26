package punto3;

public class Triangulo extends Figura{

    public Triangulo(String color) {
        super(color);
    }

    @Override
    public void cambiarColor(String color) {
        String colorAnterior = super.getColor();
        super.setColor(color);
        System.out.println("Cambiando Triangulo color de " + colorAnterior + " a " + color);
    }

    @Override
    public String queColor() {
        return  super.getColor();
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo de color " + super.getColor());
    }

    @Override
    public void borrar() {
        System.out.println("Dibujando circulo de color " + super.getColor());
    }
}
