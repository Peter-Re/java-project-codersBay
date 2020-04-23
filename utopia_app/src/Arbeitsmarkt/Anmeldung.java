package Arbeitsmarkt;

	
	public class Anmeldung {
		int anmeldeDatum;// ab wann arbeitslos datum
		String svnr; // wer arbeitslos
		int gehalt;  //letztes Gehalt

		public Anmeldung( String svnr,int anmeldeDatum,int gehalt) {

			this.anmeldeDatum = anmeldeDatum;
			this.svnr = svnr;
			this.gehalt = gehalt;
		}

		public void printInfo() {
			System.out.println("Ams Anmeldung Auskunft: "+"SV Nummer: " + svnr +" ,Arbeitslos seit: " + anmeldeDatum+"\n");
		}

		String getSVNr() {
			return svnr;
		}

}
