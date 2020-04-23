package Zentalverwaltung;
import Apotheken.*;
import Arbeitgeber.*;
import Arbeitsmarkt.*;
import Artzekammer.*;
import Krankenkasse.*;
import MeldeAmt.*;
import Pensionsversicherung.*;
import Unfallversicherung.*;


public class Main {

	public static void main(String[] args) {
		
		//Apotheken
		
		//Apotheken apotheken = new Apotheke();
		
		//Arbeitgeber
		
	    //Arbeitgeber arbeitgeber = new Arbeitgeber();
	    
	    //Arbeitsmarkt
		
	    Ams arbeitsmarkt = new Ams();  // Neues Ams erstellen
	    
	    //Ams Buerger arbeitslos anmelden - int(anmeldeDatum),string(svnr),int(gehalt)
	    arbeitsmarkt.Anmeldung(16042020,"1111", 1500);
	    
	     
	    //Ams Buerger arbeitslos abmelden - int(abmeldeDatum),string(svnr)
	    arbeitsmarkt.Abmeldung(19042020,"1111");
	    
	    //Ams abfrage Arbeitslos anmeldung vorgemerkt
	    Anmeldung p1 = arbeitsmarkt.Auskunftabmeldung("1111");
        if(p1 != null) {
           p1.printInfo();
        } else {
            System.out.println("Ams : Diese Person nicht vorgemerkt zur Anmeldung!\n");
        }
        
        //Ams abfrage Arbeitslos abmeldung vorgemerkt
	    Abmelden p2 = arbeitsmarkt.Auskunftabmelden("1111");
        if(p2 != null) {
           p2.printInfo();
        } else {
            System.out.println("Ams Abmelen Auskunft : Diese Person nicht vorgemerkt zur Abmeldung!\n");
        }
        
      //Ams abfrage Arbeitslos gemeldet
	    Gemeldet p3 = arbeitsmarkt.Auskunftgemeldet("1111");
        if(p3 != null) {
           p3.printInfo();
        } else {
            System.out.println("Ams Gemeldet Auskunft: Diese Person ist nicht gemeldet!\n");
        }
	    
	    
                                   //Artzekammer
		
	    //Artzekammer artzekammer = new Artzekammer();
	    
        //Krankenkasse
		
	    //Krankenkasse krankekasse = new Krankenkasse();
	    
                                       //MeldeAmt//
	    
	    // Neues MeldeAmt erstellen
	    MedeAmt meldeAmt = new MedeAmt(); 
	    
	    //Meldeamt neuen Buerger anlegen - string(name),string(adresse),stringSVnummer),int(alter)
	    meldeAmt.meldePerson("Gerald","Landwiedstraﬂe25,4020 Linz","1111",38);
	    meldeAmt.meldePerson("Fairan","Mellisenweg6,4060 Leonding","2222",27);
	    meldeAmt.meldePerson("Peter","Grundbachweg17,4020 Linz","3333",47);
	    
	    //MeldeAmt auszug - string
	    Person p = meldeAmt.meldeAuszug("1111");
        if (p != null) {
            p.printInfo();
        } else {
            System.out.println("Diese Person ist nicht registriert!");
        }
	    
                                    //Pensionversicherung//
		
	    //Pensionsversicherung pensionsversicherung = new Pensionsversicherung();
	    
        //Unfallversicherung
		
	    //Unfallversicherung unfallversicherung = new Unfallversicherung();
	    
	    

	}
	
}
