package kapitel_16_chat;

import java.io.*;
import java.net.Socket;

public class ChatKlientSender
{
	public static void main(String[] arg) throws IOException {
		// Socket sendSocket = new Socket("localhost",62514);  // lokal server
		Socket sendSocket = new Socket("javabog.dk",62514);  // fælles server
		System.out.println("Forbundet til "+sendSocket);

		byte[] kommando = "SEND\n".getBytes();

		OutputStream os = sendSocket.getOutputStream();
		os.write(kommando);

		String besked = "Hej verden - hvordan går det?";
		os.write( (besked + "\n").getBytes());
		sendSocket.close();
		System.out.println("Beskeden blev sendt: "+besked);
	}
}