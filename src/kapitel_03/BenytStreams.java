package kapitel_03;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
// TODO tjek at ListerJava8 er omdøbt til BenytStreams alle steder

public class BenytStreams {

	public static void main(String[] args) {
		// I java 9 kan man også skrive: List.of("is", "sko", "bil", "hammer", "tov");
		List<String> liste = Arrays.asList("is", "sko", "bil", "hammer", "tov");
		System.out.println("Listen indeholder:   " + liste);

		// map(): Definér en funktion der udføres på hvert element som giver et nyt elemebt
		List<String> sb = liste.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Listen med store bogstaver: " + sb);

		// mapToInt(): Definér en funktion der kører på hvert element og giver en int
		// sum(): giver summen af alle elementer i en IntStream
		int antalBogstaver = liste.stream().mapToInt(s -> s.length()).sum();
		System.out.println("Bogstaver i alt:     " + antalBogstaver);

		// filter(): Filtrér efter et kriterium (her s.length()==3)
		List<String> lgd3 = liste.stream().filter(s -> s.length() == 3).collect(Collectors.toList());
		System.out.println("Dem med tre bogstaver: " + lgd3);

		// parallelStream() - starter flere tråde, der hver behandler et element
		liste.parallelStream().forEach(element -> {
			try {
				System.out.print(element + "1; ");
				Thread.sleep((int) (2000 * Math.random()));
				System.out.print(element + "2; ");
				Thread.sleep((int) (2000 * Math.random()));
				System.out.print(element + "3; ");
			} catch (InterruptedException ex) {
			}
		});
		System.out.println("\nparallelStream() slut");
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
