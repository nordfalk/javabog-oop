package kapitel_03;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BenytStreams {

	public static void main(String[] args) {

		List<String> liste = Arrays.asList("is", "sko", "bil", "hammer", "tov");
		// I java 9 kan man også skrive: List.of("is","sko","bil","hammer","tov");
		System.out.println("Listen indeholder:   " + liste);

		Function<String, String> storeBogstFunktion = s -> s.toUpperCase();

		// map(): Udfør funktion på hvert element for at få et nyt element
		System.out.println("Listen med store bogstaver: " +
			liste.stream().map(storeBogstFunktion).collect(Collectors.toList()));

		// mapToInt(): Udfør på hvert element en funktion, der giver en int
		// sum(): giver summen af alle elementer i en IntStream
		int antalBogstaver = liste.stream().mapToInt(s -> s.length()).sum();
		System.out.println("Bogstaver i alt:     " + antalBogstaver);

		// filter(): Filtrér efter et kriterium (her s.length()==3)
		List<String> lgd3 =
			liste.stream().filter(s -> s.length() == 3).collect(Collectors.toList());
		System.out.println("De med tre bogstaver: " + lgd3);

		// parallelStream() - starter flere tråde, der hver behandler et element
		liste.parallelStream().forEach(element -> {
			System.out.print(element + "1; ");
			try { Thread.sleep((int) (2000 * Math.random())); } catch (Exception e) {}
			System.out.print(element + "2; ");
			try { Thread.sleep((int) (2000 * Math.random())); } catch (Exception e) {}
			System.out.print(element + "3; ");
		});
		System.out.println("\nKald til parallelStream() slut");
	}
}

/*
    // takes a Long, returns a String
    Function<Long, String> f = l -> l.toString();

    // takes nothing gives you Threads
    Supplier<Thread> s =Thread::currentThread;

    // takes a string as the parameter
    Consumer<String> c = System.out::println;
 */
