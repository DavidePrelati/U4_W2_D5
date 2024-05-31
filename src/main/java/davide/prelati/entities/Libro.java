package davide.prelati.entities;

import davide.prelati.exceptions.StringaNonValida;

public class Libro extends Catalogo {

    private String autore;
    private String genere;

    public Libro(String codiceIBSN, String titolo, int numeroPagine, int annoDiPubblicazione, String autore, String genere) {
        super(codiceIBSN, titolo, numeroPagine, annoDiPubblicazione);
        this.autore = autore;
        this.genere = genere;
    }


    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) throws StringaNonValida {
        if (autore.length() <= 3) throw new StringaNonValida(autore);
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) throws StringaNonValida {
        if (genere.length() <= 2) throw new StringaNonValida(genere);
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ibsn='" + getCodiceIBSN() + '\'' +
                ", title='" + getTitolo() + '\'' +
                ", publicationYear=" + getAnnoDiPubblicazione() +
                ", numberOfPages=" + getNumeroPagine() +
                ", author='" + autore + '\'' +
                ", genre='" + genere + '\'' +
                '}';
    }
}
