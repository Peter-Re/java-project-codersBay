package WKO;

class Firma {
    String firmenName;
    String firmenAdresse;
    String firmenEmail;
    String firmenKennZahl;

    public Firma(String firmenName, String firmenAdresse, String firmenEmail, String firmenKennZahl) {
        this.firmenName = firmenName;
        this.firmenAdresse = firmenAdresse;
        this.firmenEmail = firmenEmail;
        this.firmenKennZahl = firmenKennZahl;
    }
    
    void firmenInfos() {
        System.out.println("Firmen Name         : "+this.firmenName);
        System.out.println("Firmen Adresse      : "+this.firmenAdresse);
        System.out.println("Firmen KennZahl     : "+this.firmenKennZahl);
        System.out.println("Firmen Email        : "+this.firmenEmail+"\n");
    }

    public String getFirmenKennZahl() {
        return firmenKennZahl;
    }


}
