package davide.prelati.exceptions;

import davide.prelati.entities.Catalogo;

public class StringaVuota extends Exception {
    public StringaVuota(Catalogo str) {
        super("La stringa " + str + "Non può essere nulla");
    }
}
