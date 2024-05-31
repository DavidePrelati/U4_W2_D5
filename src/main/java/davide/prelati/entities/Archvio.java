package davide.prelati.entities;

import java.util.ArrayList;
import java.util.List;

public class Archvio {

    private List<Catalogo> catalogos;

    public Archvio() {
        this.catalogos = new ArrayList<>();
    }

    //esercizio 1
    public void addItem(Catalogo elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("L'elemento non può essere nullo");
        }
        catalogos.add(elemento);
    }

}
