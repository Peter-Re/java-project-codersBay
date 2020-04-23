package Arbeitsmarkt;

public class Verwaltung {
	
	static int gehalt = 1500;
	static int arbeitslosengeld;
	

	public static void main(String[] args) {
		
		//Ams abfrage Arbeitslos anmeldung vorgemerkt
		
		Ams arbeitsmarkt = new Ams();  // Neues Ams erstellen
		
	    Anmeldung p1 = arbeitsmarkt.Auskunftabmeldung("1111");
        if(p1 != null) {
           p1.printInfo();
        } else {
            System.out.println("Ams : Diese Person nicht vorgemerkt zur Anmeldung!");
        }
		
		
		//berechnung arbeitslosengeld 80% vom Gehalt
		
		arbeitslosengeld = (gehalt / 100 )*80;
		System.out.println("Arbeitslosengeld :"+arbeitslosengeld);
		

	}

}
