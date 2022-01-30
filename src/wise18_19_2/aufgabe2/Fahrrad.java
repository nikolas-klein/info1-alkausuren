package wise18_19_2.aufgabe2;

public class Fahrrad {
  protected int rahmenHoehe;
  protected boolean ausgeliehen;
  protected FahrradTyp typ;

  public Fahrrad(int rahmenHoehe, boolean ausgeliehen) {
    this.rahmenHoehe = rahmenHoehe;
    this.ausgeliehen = ausgeliehen;
  }

  public int getRahmenHoehe() {
    return rahmenHoehe;
  }

  public FahrradTyp getTyp(){
    return typ;
  }

  public boolean getAusgeliehen(){
    return ausgeliehen;
  }

  public void setRahmenHoehe(int rahmenHoehe) {
    this.rahmenHoehe = rahmenHoehe;
  }

  public void setAusgeliehen(boolean ausgeliehen) {
    this.ausgeliehen = ausgeliehen;
  }
}
