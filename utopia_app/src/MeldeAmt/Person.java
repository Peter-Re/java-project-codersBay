package MeldeAmt;

	public class Person {
	    String name;
	    String adresse;
	    int alter;
	    String svnr;

	   public Person (String name, String adresse, String svnr, int alter) {
	        this.name = name;
	        this.svnr = svnr;
	        this.adresse = adresse;
	        this.alter = alter;
	    }
	    public void printInfo() {
	        System.out.println("MeldeAmt Auskunft: " + "SV Nummer: "+svnr+" Name: "+name+", Adresse: "+adresse+",Alter: "+alter+"\n");
	    }

	    String getSVNr() {
	        return svnr;
	    }
	
	}


