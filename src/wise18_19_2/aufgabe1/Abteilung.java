package wise18_19_2.aufgabe1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Abteilung {

  protected int mitarbeiter;
  protected List<Abteilung> unterabteilungen;

  public Abteilung(int m){
    if(m<0){
      throw new IllegalArgumentException();
    }else {
      mitarbeiter = m;
    }
    unterabteilungen = new ArrayList<>();
  }

  public void addUnterabteilung(Abteilung u){
    unterabteilungen.add(u);
  }

  public int getAnzahlMitarbeiter(){
    List<Abteilung> all = new LinkedList<>(unterabteilungen);
    int anzahl = mitarbeiter;
    while (!all.isEmpty()) {
      Abteilung head = all.get(0);
      all.addAll(head.unterabteilungen);
      anzahl += head.mitarbeiter;
      all.remove(head);
    }
    return anzahl;
  }


  public static void main(String[] args) {
    Abteilung abteilung1 = new Abteilung(5);
    Abteilung abteilung2 = new Abteilung(5);
    Abteilung abteilung3 = new Abteilung(5);
    Abteilung abteilung4 = new Abteilung(5);
    abteilung1.addUnterabteilung(abteilung2);
    abteilung2.addUnterabteilung(abteilung3);
    abteilung1.addUnterabteilung(abteilung4);
    System.out.println(abteilung1.getAnzahlMitarbeiter());
    System.out.println(abteilung2.getAnzahlMitarbeiter());
    System.out.println(abteilung3.getAnzahlMitarbeiter());
    System.out.println(abteilung4.getAnzahlMitarbeiter());
  }

}
