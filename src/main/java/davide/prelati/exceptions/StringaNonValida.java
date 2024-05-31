package davide.prelati.exceptions;

public class StringaNonValida extends Exception {

    public StringaNonValida(String str) {
        super("La stringa " + str + "non è valida");
    }
}
