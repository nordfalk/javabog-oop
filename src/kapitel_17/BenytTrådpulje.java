package kapitel_17;

import java.util.concurrent.*;

public class BenytTrådpulje
{
	public static void main(String[] arg)
	{
		ScheduledExecutorService trådpulje = Executors.newScheduledThreadPool(3);
		trådpulje.execute(new SnakkesagligPerson("Jacob",150));
		trådpulje.execute(new SnakkesagligPerson("Troels",400));

		Runnable opg = () -> System.out.println("tik tak");  // kør anonym funktion
		trådpulje.scheduleAtFixedRate(opg, 0, 1, TimeUnit.SECONDS); // hvert sekund
	}
}