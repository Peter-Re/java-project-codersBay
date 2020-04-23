package Arbeitsmarkt;

public class Gemeldet {
	
	
	String svnr; // wer arbeitslos

	public Gemeldet( String svnr) {

		this.svnr = svnr;
	}
	public void printInfo() {
		System.out.println("Ams Gemeldet: "+ " SV Nummer: "+svnr+" ist gemeldet\n");
	}

	String getSVNr() {
		return svnr;
	}

}