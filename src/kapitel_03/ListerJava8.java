package kapitel_03;
import java.util.*;
public class ListerJava8
{
  public static void main(String[] args)
  {
		ArrayList<String> liste = new ArrayList<>();
    Collections.addAll(liste, "is", "sko", "bil", "hammer", "tov");
    System.out.println("Listen indeholder:   "+liste);
/*
		// map: Definér en funktion der udføres på hvert element
		List<String> sb = liste.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    System.out.println("Listen med store bogstaver: "+sb);

		// mapToInt: Definér en funktion der udføres på hvert element
		// sum: giver summen
		int antalBogstaver = liste.stream().mapToInt(s -> s.length()).sum();
    System.out.println("Bogstaver i alt:     "+antalBogstaver);


		// filter: Filtrér efter et kriterium (her s.length()==3)
		List<String> treb = liste.stream().filter(s -> s.length()==3).collect(Collectors.toList());
    System.out.println("Dem med tre bogstaver: "+treb);
*/
  }
}