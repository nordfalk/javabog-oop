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
			Socket forbindelse = serversocket.accept();
			System.out.println("Ny forbindelse fra "+forbindelse);
			Scanner scanner = new Scanner(forbindelse.getInputStream());
			String kommando = scanner.nextLine();
			System.out.println("kommando: "+kommando);

			if (kommando.equals("SEND")) {
				String tekst = scanner.nextLine();
				System.out.println("tekst: "+tekst);
				sendTilModtagere(forbindelse+" skrev: "+tekst, modtagere);
				sendTilModtagere(tekst, modtagere);
			} else if (kommando.equals("MODTAG")) {
				String tid = String.format("%tT %1$tD", new Date());
				sendTilModtagere(forbindelse+" hoppede på klokken "+tid, modtagere);
				OutputStream os = forbindelse.getOutputStream();
				os.write("Velkommen til chatserveren\n".getBytes());
				os.write(("Der er lige nu "+ modtagere.size() +" på.\n").getBytes());
				os.write("--------------------------\n".getBytes());
				modtagere.add(os);
			} else {
				System.out.println("Ukendt kommando "+kommando+" fra "+forbindelse);
			}
		}
	}
}