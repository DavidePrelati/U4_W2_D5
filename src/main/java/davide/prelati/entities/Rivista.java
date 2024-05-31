package davide.prelati.entities;

public class Rivista extends Catalogo {
    private Periodicita periodicita;

    public Rivista(Periodicita periodicita, String codiceIBSN, String titolo, int numeroPagine, int annoDiPubblicazione) {
        super(codiceIBSN, titolo, numeroPagine, annoDiPubblicazione);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "ibsn='" + getCodiceIBSN() + '\'' +
                ", title='" + getTitolo() + '\'' +
                ", publicationYear=" + getAnnoDiPubblicazione() +
                ", numberOfPages=" + getNumeroPagine() +
                ", periodicity=" + periodicita +
                '}';
    }
}
