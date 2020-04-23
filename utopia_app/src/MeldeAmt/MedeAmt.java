package MeldeAmt;
import java.util.ArrayList;

interface Meldeamt {
    void meldePerson(Person person);
    void meldePerson(String name, String adresse, String svnr, int alter);
    Person meldeAuszug(String svnr);
}


public class MedeAmt implements Meldeamt{
    ArrayList<Person> meldeList;

    public MedeAmt () {
        meldeList = new ArrayList<Person>();
    }

    public void meldePerson(String name, String adresse, String svnr, int alter) {
        meldeList.add(new Person(name, adresse, svnr, alter));
    }

    public void meldePerson(Person person) {
        meldeList.add(person);
    }

    public Person meldeAuszug(String svnr) {
        Person myResult = null;
        for (Person p : meldeList) {
            if (p.getSVNr() == svnr) {
                myResult = p;
            }
        }
        return myResult;
    }
}