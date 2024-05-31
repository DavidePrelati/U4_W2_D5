package davide.prelati.entities;

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

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
