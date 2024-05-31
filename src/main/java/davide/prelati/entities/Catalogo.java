package davide.prelati.entities;


public abstract class Catalogo {

    private String CodiceIBSN;
    private String titolo;
    private int annoDiPubblicazione;
    private int numeroPagine;

    public Catalogo(String codiceIBSN, String titolo, int numeroPagine, int annoDiPubblicazione) {
        ;
        this.CodiceIBSN = codiceIBSN;
        this.titolo = titolo;
        this.numeroPagine = numeroPagine;
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public String getCodiceIBSN() {
        return CodiceIBSN;
    }

    public void setCodiceIBSN(String codiceIBSN) {
        CodiceIBSN = codiceIBSN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "CodiceIBSN='" + CodiceIBSN + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
