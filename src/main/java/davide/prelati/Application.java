package davide.prelati;

import davide.prelati.entities.Archvio;
import davide.prelati.entities.Libro;
import davide.prelati.entities.Periodicita;
import davide.prelati.entities.Rivista;
import davide.prelati.exceptions.StringaNullaPerCodiceIBSN;
import davide.prelati.exceptions.StringaVuota;

public class Application {

    public static void main(String[] args) throws StringaVuota {

        Archvio archivio = new Archvio();

        Libro libro_1 = new Libro("TTWWPP3456", "Harry Potter 1", 476, 2003, "J.K. Rowling", "Fantasy");
        Libro libro_2 = new Libro("TTWWPP4637", "Dragon Ball ", 503, 1984, "Akira Toriyama", "Fantasy");
        Libro libro_3 = new Libro("TTWWPP2279", "Harry Potter 3", 257, 2005, "J.K. Rowling", "Fantasy");
        Rivista rivista_1 = new Rivista(Periodicita.MENSILE, "LLPPYY9065", "Dragon Ball Super", 180, 2021);
        Rivista rivista_2 = new Rivista(Periodicita.SETTIMANALE, "LLPPYY4038", "Dragon Ball Z", 200, 1995);
        Rivista rivista_3 = new Rivista(Periodicita.ANNUALE, "LLPPYY3087", "Dragon Ball GT", 140, 1998);

        archivio.addItem(libro_1);
        archivio.addItem(libro_2);
        archivio.addItem(libro_3);
        archivio.addItem(rivista_1);
        archivio.addItem(rivista_2);
        archivio.addItem(rivista_3);

        archivio.printItems();
        System.out.println("\nRicerca per codice IBSN LLPPYY9065");
        System.out.println(archivio.searchForCodiceISBN("LLPPYY9065"));

        System.out.println("\nRicerca per codice IBSN LLPPYY4038");
        System.out.println(archivio.searchForCodiceISBN("LLPPYY4038"));

        System.out.println("\nRicerca per anno 1995");
        System.out.println(archivio.searchForAnnoDiPubblicazione(1995));

        System.out.println("\nRicerca per l'autore Akira Toriyama\n\n");
        System.out.println(archivio.searchForAutore("Akira Toriyama"));

        try {
            archivio.removeItem("TTWWPP2279");
        } catch (StringaNullaPerCodiceIBSN e) {
            throw new RuntimeException(e);
        }

        archivio.printItems();


    }
}
