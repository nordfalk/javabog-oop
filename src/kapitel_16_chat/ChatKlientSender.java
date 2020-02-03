package kapitel_16_chat;

import java.io.*;
import java.net.Socket;

public class ChatKlientSender
{
	public static void main(String[] arg) throws IOException {
		// Socket forbindelse = new Socket("localhost",62514);  // lokal server
		Socket forbindelse = new Socket("javabog.dk",62514);  // fælles server
		System.out.println("Forbundet til "+forbindelse);

		OutputStream os = forbindelse.getOutputStream();
		byte[] kommando = "SEND\n".getBytes();
		os.write(kommando);

		String besked = "Hej verden - hvordan går det? ";
		os.write( (besked + "\n").getBytes());
		System.out.println("Beskeden blev sendt: "+besked);
	}
}