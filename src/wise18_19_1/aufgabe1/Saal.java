package wise18_19_1.aufgabe1;

public class Saal {

  protected boolean [] [] saal;

  public Saal(int reihen, int plaetze){
    saal = new boolean[reihen][plaetze];
  }

  public int anzahlFreiePlaetze(){
    int counter = 0;
    for (int i = 0; i < saal.length; i++) {
      for (int j = 0; j < saal[i].length; j++) {
        if (!saal[i][j]) {
          counter++;
        }
      }
    }
    return counter;
  }

  public boolean belegePlatz(int r, int p){
    if(!saal[r][p]){
      saal[r][p] = true;
      return true;
    }else return false;
  }

  public static void main(String[] args) {
    Saal saal1 = new Saal(5,5);
    System.out.println(saal1.anzahlFreiePlaetze());
    saal1.belegePlatz(4,3);
    System.out.println(saal1.anzahlFreiePlaetze());
  }
}
