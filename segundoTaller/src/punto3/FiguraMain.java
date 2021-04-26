package punto3;

public class FiguraMain {
    public static void main(String[] args) {
        Figura circulo = new Circulo("Rojo");
        Figura circulo2 = new Circulo("Verde");
        Figura circulo3 = new Circulo("Amarillo");
        Pizarra pizarra = new Pizarra();

        pizarra.agregarFigura(circulo);
        pizarra.agregarFigura(circulo2);
        pizarra.agregarFigura(circulo3);
        pizarra.dibujarTodo();
        System.out.println("");
        pizarra.borrarTodo();

        System.out.println("");
        circulo.dibujar();
        circulo.cambiarColor("Morado");
        circulo.dibujar();
    }
}
