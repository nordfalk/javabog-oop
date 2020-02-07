package kapitel_16_chat;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class ChatKlientModtager
{
	public static void main(String[] arg) throws IOException {
		// Socket modtagSocket = new Socket("localhost",62514);  // lokal server
		Socket modtagSocket = new Socket("javabog.dk",62514);  // fælles server
		System.out.println("Forbundet til "+modtagSocket);

		byte[] kommando = "MODTAG\n".getBytes();

		OutputStream os = modtagSocket.getOutputStream();
		os.write(kommando);

		Scanner scanner = new Scanner(modtagSocket.getInputStream());
		while (true) {
			String chatTekst = scanner.nextLine();

			String tidspunkt = String.format("%tT", new Date());
			System.out.println(tidspunkt + " " + chatTekst);
		}
	}
}