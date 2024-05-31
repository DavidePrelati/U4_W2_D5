package davide.prelati.entities;

import davide.prelati.exceptions.StringaNullaPerCodiceIBSN;
import davide.prelati.exceptions.StringaVuota;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Archvio {

    private List<Catalogo> catalogos;

    public Archvio() {
        this.catalogos = new ArrayList<>();
    }

    //esercizio 1
    public void addItem(Catalogo elemento) throws StringaVuota {
        if (elemento == null) throw new StringaVuota(elemento);
        catalogos.add(elemento);
    }

    //esercizio 2
    public void removeItem(String codiceIBSN) throws StringaNullaPerCodiceIBSN {
        if (codiceIBSN == null) throw new StringaNullaPerCodiceIBSN(codiceIBSN);
        catalogos.removeIf(catalogo -> catalogo.getCodiceIBSN().equals(codiceIBSN));
    }

    //esercizio 3
    public Catalogo searchForCodiceISBN(String codiceISBN) {
        return catalogos.stream().filter(elemento -> elemento.getCodiceIBSN()
                .equals(codiceISBN)).findFirst().orElse(null);
    }

    //esercizio 4

    public List<Catalogo> searchForAnnoDiPubblicazione(int annoDiPubblicazione) {
        return catalogos.stream()
                .filter(elemento -> elemento.getAnnoDiPubblicazione() == annoDiPubblicazione).collect(Collectors.toList());
    }

    //esercizio 5
    public List<Libro> searchForAutore(String autore) {
        return catalogos.stream().filter(elemento -> elemento instanceof Libro).map(elemento -> (Libro) elemento)
                .filter(libro -> libro.getAutore().equalsIgnoreCase(autore)).collect(Collectors.toList());
    }
}
