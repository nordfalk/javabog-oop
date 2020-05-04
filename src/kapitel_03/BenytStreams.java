package kapitel_03;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BenytStreams {

	public static void main(String[] args) {

		List<String> liste = List.of("is", "sko", "bil", "hammer", "tov", "esperanto", "sprog");
		System.out.println("Listen indeholder:   " + liste);

		Function<String, String> storeBogstFunktion = s -> s.toUpperCase();

		// map(): Udfør funktion på hvert element for at få et nyt element
		System.out.println("Med store bogstaver: " +
						liste.stream().map(storeBogstFunktion).collect(Collectors.toList()));

		// mapToInt(): Udfør på hvert element en funktion, der giver en int
		// sum(): giver summen af alle elementer i en IntStream
		int antalBogstaver = liste.stream().mapToInt(s -> s.length()).sum();
		System.out.println("Bogstaver i alt:     " + antalBogstaver);

		// filter(): Filtrér efter et kriterium (her s.length()==3), og sortér
		List<String> korteOrdSorteret = liste.stream()
						.filter(s -> s.length() <= 3).sorted().collect(Collectors.toList());
		System.out.println("Korte ord, sorteret: " + korteOrdSorteret);

		// parallelStream() - starter flere tråde, der hver behandler et element
		liste.parallelStream().forEach(element -> {
			System.out.print(element + "1; ");
			try {
				Thread.sleep((int) (2000 * Math.random()));
			} catch (Exception e) {
			}
			System.out.print(element + "2; ");
			try {
				Thread.sleep((int) (2000 * Math.random()));
			} catch (Exception e) {
			}
			System.out.print(element + "3; ");
		});
		System.out.println("   - parallel behandling slut");
	}
}