package kapitel_16_chat;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * En chat-server. Langt bedre end Discord :-)
 */
public class ChatServer
{
	private static void sendTilModtagere(String tekst, ArrayList<OutputStream> modtagere)	{
		for (OutputStream modtager : new ArrayList<>(modtagere)) {
			try {
				modtager.write((tekst+"\n").getBytes());
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Fjernet modtager "+modtager);
				modtagere.remove(modtager);
			}
		}
	}

	public static void main(String[] arg) throws IOException {
		ServerSocket serversocket = new ServerSocket(62514);

		ArrayList<OutputStream> modtagere = new ArrayList<>();

		while (true)
		{
			Socket socket = serversocket.accept();
			System.out.println("Ny forbindelse fra "+socket);
			Scanner scanner = new Scanner(socket.getInputStream());
			String kommando = scanner.nextLine();
			System.out.println("kommando: "+kommando);

			if (kommando.startsWith("BRUGER")) {
				kommando = scanner.nextLine(); // fremtidig udvidelse - spring over den kommando og kig på den næste
			}

			if (kommando.equals("SEND")) {
				String tekst = scanner.nextLine();
				System.out.println("tekst: " + tekst);
				sendTilModtagere(socket + " skrev:", modtagere);
				sendTilModtagere(tekst, modtagere);
				socket.close();
			} else if (kommando.equals("MODTAG")) {
				String tidspunkt = String.format("%tT %1$tD", new Date());
				sendTilModtagere(socket+" hoppede på klokken "+tidspunkt, modtagere);
				OutputStream os = socket.getOutputStream();
				os.write("Velkommen til chatserveren\n".getBytes());
				os.write(("Der er lige nu "+ modtagere.size() +" på.\n").getBytes());
				os.write("--------------------------\n".getBytes());
				modtagere.add(os);
			} else {
				System.out.println("Ukendt kommando " + kommando + " fra " + socket);
				socket.close();
			}
		}
	}
}