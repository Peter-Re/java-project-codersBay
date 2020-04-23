package Arbeitsmarkt;

public class Abmelden {
	
	int abmeldeDatum;// ab wann arbeitslos datum
	String svnr; // wer arbeitslos

	public Abmelden(int abmeldeDatum, String svnr) {

		this.abmeldeDatum = abmeldeDatum;
		this.svnr = svnr;
	}

	public void printInfo() {
		System.out.println("Ams Abmeldung Auskunft: "+ " SV Nummer: " + svnr+" ,Arbeitsaufnahme: " + abmeldeDatum +"\n");
	}

	String getSVNr() {
		return svnr;
	}

}



