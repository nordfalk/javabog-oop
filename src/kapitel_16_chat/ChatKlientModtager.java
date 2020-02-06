package kapitel_16_chat;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class ChatKlientModtager
{
	public static void main(String[] arg) throws IOException {
		// Socket forbindelse = new Socket("localhost",62514);  // lokal server
		Socket forbindelse = new Socket("javabog.dk",62514);  // fælles server
		System.out.println("Forbundet til "+forbindelse);

		OutputStream os = forbindelse.getOutputStream();
		byte[] kommando = "MODTAG\n".getBytes();
		os.write(kommando);

		Scanner scanner = new Scanner(forbindelse.getInputStream());
		while (true) {
			String chatTekst = scanner.nextLine();

			String tid = String.format("%tT", new Date());
			System.out.println(tid + " " + chatTekst);
		}
	}
}