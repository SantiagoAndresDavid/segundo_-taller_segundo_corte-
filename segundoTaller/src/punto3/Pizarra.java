package punto3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizarra {
    List<Figura> figuras;

    public Pizarra() {
        this.figuras =  new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void dibujarTodo() {
        List<Figura> figurasAlreves = new ArrayList<>(figuras);
        Collections.reverse(figurasAlreves);
        figuras.forEach(Figura::dibujar);
    }

    public void borrarTodo() {
        figuras.forEach(Figura::borrar);
    }
}
