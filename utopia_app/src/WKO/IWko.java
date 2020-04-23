package WKO;

public interface IWko {
    void firmaZulassen(Firma firma);
    void firmaZulassen(String name, String adresse, String firmenEmail, String firmenKennZahl);
    boolean firmaSchließen(String firmenKennZahl);
    Firma firmaDaten(String firmenKennZahl);

}
