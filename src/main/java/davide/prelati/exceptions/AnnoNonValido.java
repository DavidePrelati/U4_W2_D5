package davide.prelati.exceptions;

public class AnnoNonValido extends RuntimeException {

    public AnnoNonValido(int n) {
        super("Non essere ridicolo! Il numero" + n + " è minore di 1 ");
    }
}
