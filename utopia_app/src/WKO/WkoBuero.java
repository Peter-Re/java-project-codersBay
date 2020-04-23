package WKO;

import java.util.ArrayList;

public class WkoBuero implements IWko {

    ArrayList<Firma> firmenListe;

    WkoBuero() {
        firmenListe = new ArrayList<Firma>();
    }

    @Override
    public void firmaZulassen(Firma firma) {
        firmenListe.add(firma);
    }

    @Override
    public void firmaZulassen(String name, String adresse, String firmenEmail, String firmenKennZahl) {
        firmenListe.add(new Firma(name, adresse, firmenEmail,firmenKennZahl));
    }

    @Override
    public boolean firmaSchließen(String firmenKennZahl) {
        for (Firma f: firmenListe) {
            if (f.getFirmenKennZahl() == firmenKennZahl) {
                firmenListe.remove(f);
                return true;
            }
        }
        return false;
    }

    @Override
    public Firma firmaDaten(String firmenKennZahl) {
        for (Firma f : firmenListe) {
            if (f.getFirmenKennZahl() == firmenKennZahl) {
                System.out.println("The company is in the system");
            }
        }
        return null;
    }


}
