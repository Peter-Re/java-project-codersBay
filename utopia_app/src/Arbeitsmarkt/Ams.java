package Arbeitsmarkt;

import java.util.ArrayList;

import MeldeAmt.*;

interface Arbeitsmarkt {
	void Anmeldung(Anmeldung personAms);
	void Anmeldung(int anmeldeDatum, String svnr,int gehalt);
	void Abmeldung(int abmeldeDatum, String svnr);
	Anmeldung Auskunftabmeldung(String svnr);
	Abmelden  Auskunftabmelden(String svnr);
	Gemeldet Auskunftgemeldet(String svnr);
}



public class Ams implements Arbeitsmarkt {
	ArrayList<Anmeldung> anmeldeList;
	ArrayList<Abmelden> abmeldeList;
	ArrayList<Gemeldet> meldeList;

	public Ams() {
		anmeldeList = new ArrayList<Anmeldung>();
		abmeldeList = new ArrayList<Abmelden>();
		meldeList = new ArrayList<Gemeldet>();
	}

	public void Anmeldung(int anmeldeDatum, String svnr,int gehalt) {
		anmeldeList.add(new Anmeldung(svnr, anmeldeDatum,gehalt));
	}
	public void Abmeldung(int abmeldeDatum, String svnr) {
		abmeldeList.add(new Abmelden(abmeldeDatum, svnr));
	}

	public void Anmeldung(Anmeldung personAms) {
		anmeldeList.add(personAms);
	}
	
	public void Abmeldung(Abmelden abmeldung) {
		abmeldeList.add(abmeldung);
	}

	public Anmeldung Auskunftabmeldung(String svnr) {
		Anmeldung myResultAms = null;
		for (Anmeldung p1 : anmeldeList) {
			if (p1.getSVNr() == svnr) {
				myResultAms = p1;
			}
		}
		return myResultAms;
		
	}
	
	public Abmelden Auskunftabmelden(String svnr) {
		 Abmelden myResultAmsabmelden = null;
		 for (Abmelden p2 : abmeldeList) {
				if (p2.getSVNr() == svnr) {
					myResultAmsabmelden = p2;
				}
			}
		return myResultAmsabmelden;
	}
	
	public Gemeldet Auskunftgemeldet(String svnr) {
		 Gemeldet myResultGemeldet = null;
		 for (Gemeldet p3 : meldeList) {
				if (p3.getSVNr() == svnr) {
					myResultGemeldet = p3;
				}
			}
		return myResultGemeldet;
	}
}
