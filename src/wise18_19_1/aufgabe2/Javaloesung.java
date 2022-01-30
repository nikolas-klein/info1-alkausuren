package wise18_19_1.aufgabe2;

public class Javaloesung {

  public static double cos(double x){
    double ret = 0;
    int n = 0;
    double summand;
    do {
      summand = Math.pow((-1),n) * Math.pow(x,(2*n))/ fac((2*n));
      System.out.println(summand);
      ret += summand;
      n++;
      }while (summand > 0.001);
    return ret;
  }

  public static double fac(int x){
    int ret = 1;
    for (int i = 1; i <= x ; i++) {
      ret *= i;
    }
    System.out.println(ret);
    return ret;
  }

  public static void main(String[] args) {
    System.out.println(cos(5.0));
  }

}
