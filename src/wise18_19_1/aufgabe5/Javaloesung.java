package wise18_19_1.aufgabe5;

import java.util.Arrays;

public class Javaloesung {

  public static double stdabw(double[] xs){
    double mittelwert = Arrays.stream(xs).sum()/xs.length;
    double summe = 0d;
    for (int i = 0; i < xs.length-1; i++) {
      summe += (xs[i]-mittelwert)*(xs[i]-mittelwert)/ xs.length;
    }
    return Math.sqrt(summe);

  }

  public static double stdabwStream(double[] xs){
    double mittelwert = Arrays.stream(xs).sum()/xs.length;
    double summe = Arrays.stream(xs).map(x -> (x- mittelwert)*(x- mittelwert)/ xs.length).sum();
    return Math.sqrt(summe);
  }

  public static void main(String[] args) {
    double[] arr = {6,3,6,5,5};
    System.out.println(stdabw(arr));
  }

}
