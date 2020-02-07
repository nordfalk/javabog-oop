package kapitel_17;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * En flertrådet chat-server. Langt bedre end Discord :-)
 */
public class FlertraadetChatServer
{
	static ArrayList<Klientforbindelse> klientforbindelser = new ArrayList<>();
	static ExecutorService executor = Executors.newCachedThreadPool();

	private static void sendTilAlle(String tekst)	{
		for (final Klientforbindelse modtager : new ArrayList<>(klientforbindelser)) {
			executor.submit(() -> {  // Transport af tekst til klienter kan blokere, så brug seperat tråd
				try {
					modtager.os.println(tekst);
					modtager.os.flush();
					System.out.println("Sendt til "+modtager+": "+tekst);
				} catch (Exception e) {
					System.out.println("Fjerner modtager "+modtager+": "+e);
					klientforbindelser.remove(modtager);
				}
			});
		}
	}

	public static void main(String[] arg) throws IOException {
		ServerSocket serversocket = new ServerSocket(62514);


		while (true)
		{
			Socket socket = serversocket.accept();
			Klientforbindelse klientforbindelse = new Klientforbindelse(socket);
			klientforbindelser.add(klientforbindelse);
			executor.submit(klientforbindelse);
		}
	}

	private static class Klientforbindelse implements Runnable {
		private Socket socket;
		private String bruger;
		private PrintWriter os;

		public Klientforbindelse(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				os = new PrintWriter(socket.getOutputStream());

				bruger = socket.toString();
				System.out.println("Ny forbindelse fra "+bruger);
				Scanner scanner = new Scanner(socket.getInputStream());
				while (scanner.hasNextLine()) {
					String kommando = scanner.nextLine();
					System.out.println("kommando: " + kommando);

					if (kommando.startsWith("BRUGER ")) {
						System.out.println("Skifter bruger fra: "+bruger);
						bruger = kommando.substring(bruger.indexOf(" ")+1);
						System.out.println("Skifter bruger til: "+bruger);
					} else if (kommando.equals("SEND")) {
						String tekst = scanner.nextLine();
						System.out.println("tekst: " + tekst);
						sendTilAlle(bruger + " skrev:");
						sendTilAlle(tekst);
					} else if (kommando.equals("MODTAG")) {
						// ignorér - alle data sendes til alle modtagere, men vi kan da godt skrive at personen er hoppet på...
						String tidspunkt = String.format("%tT %1$tD", new Date());
						sendTilAlle(socket + " hoppede på klokken " + tidspunkt);
						os.println("Velkommen til chatserveren");
						os.println("Der er lige nu " + klientforbindelser.size() + " på.");
						os.println("--------------------------");
					} else {
						System.out.println("Ukendt kommando " + kommando + " fra " + socket);
					}
				}
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}