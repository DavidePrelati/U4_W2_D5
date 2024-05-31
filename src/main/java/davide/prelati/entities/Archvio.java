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
        catalogos.add(elemento);
    }

    //esercizio 2
    public void removeItem(String codiceIBSN) {
        catalogos.removeIf(catalogo -> catalogo.getCodiceIBSN().equals(codiceIBSN));
    }

    
}
