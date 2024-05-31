package davide.prelati.exceptions;

public class AnnoNonValido extends RuntimeException {

    public AnnoNonValido(int n) {
        super("Non essere ridicolo! Purtroppo non ci sono riviste prima dell'anno " + n);
    }
}
