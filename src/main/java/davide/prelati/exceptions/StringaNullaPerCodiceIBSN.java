package davide.prelati.exceptions;

public class StringaNullaPerCodiceIBSN extends Exception {

    public StringaNullaPerCodiceIBSN(String str) {
        super("La stringa " + str + "non può essere nulla");
    }
}
