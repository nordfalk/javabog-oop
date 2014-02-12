package kapitel_03;
import java.util.*;
public class StandardmetoderTilLister
{
  public static void main(String[] args)
  {
    ArrayList<Integer> liste = new ArrayList<Integer>();
    liste.add(8);                                          // tilføj ét element
    Collections.addAll(liste, 1, 2, 3, 4, 5, 6, 3, 3, 3, 9); // tilf mange elem
    System.out.println("Listen indeholder:   "+liste);

    Collections.sort(liste);
    System.out.println("Listen sorteret:     "+liste);

    Collections.reverse(liste);
    System.out.println("Listen baglæns:      "+liste);

    Collections.shuffle(liste);
    System.out.println("Listen blandet igen: "+liste);
    
    System.out.println("Største tal i listen: "+Collections.max(liste));

    System.out.println("Antal 3-taller      : "+Collections.frequency(liste,3));

    ArrayList<Integer> liste2 = new ArrayList<Integer>();
    liste2.addAll(liste);          // tilføj alle elementer fra liste til liste2
    System.out.println("Kopien liste2 indeh: "+liste2);

    liste.subList(0,5).clear();    // fjern element 0 til 5 fra liste
    System.out.println("Liste uden elem 0-5: "+liste);
    
    liste2.removeAll(liste);       // fjern element 5 til 9 fra liste2
    System.out.println("Liste2 u. andre elem:"+liste2);
  }
}