package wise18_19_1.aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class Verleih {
  protected List<Fahrrad> bestand = new ArrayList<>();

  public void addFahrad(Fahrrad f){
    bestand.add(f);
  }

  public boolean verfuegbar(FahrradTyp t, int rahmenhoehe){
    long anzahl = bestand.stream().filter(fahrrad -> fahrrad.getRahmenHoehe() == rahmenhoehe && !fahrrad.ausgeliehen && fahrrad.getTyp() == t).count();
    return anzahl > 0;
  }

  public Fahrrad ausleihen(FahrradTyp t, int rahmenhoehe){
    List<Fahrrad> fahrraeder = bestand.stream().filter(fahrrad -> fahrrad.getRahmenHoehe() == rahmenhoehe && !fahrrad.ausgeliehen && fahrrad.getTyp() == t).toList();
    if(fahrraeder.isEmpty()) return null;
    else return fahrraeder.get(0);
  }
}
