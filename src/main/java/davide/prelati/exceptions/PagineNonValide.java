package davide.prelati.exceptions;

public class PagineNonValide extends RuntimeException {

    public PagineNonValide(int n) {
        super("Non esistiono libri con un numero di " + n + "pagine");
    }
}
