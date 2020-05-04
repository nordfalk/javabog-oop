package xtra;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.Scanner;

public class BenytScannerHentJavabog {
	public static void main(String[] arg) throws IOException {

		Socket forbindelse = new Socket("javabog.dk", 80);

		OutputStream os = forbindelse.getOutputStream();
		os.write("GET / HTTP/1.1\r\n".getBytes());
		os.write("Host: javabog.dk\r\n".getBytes());
		os.write("\r\n".getBytes());
		Scanner scanner = new Scanner(forbindelse.getInputStream());

		// https://docs.google.com/spreadsheets/d/1q4qe7gBYYAPZWr23LCPKFFbh2vmhpwfbsNfbZYLMs80/edit#gid=173788461
		//Scanner scanner = new Scanner(new URL("https://docs.google.com/spreadsheets/d/1q4qe7gBYYAPZWr23LCPKFFbh2vmhpwfbsNfbZYLMs80/export?format=csv&id=1q4qe7gBYYAPZWr23LCPKFFbh2vmhpwfbsNfbZYLMs80&gid=173788461").openStream());

		// https://docs.google.com/document/d/e/2PACX-1vSytgvBw-1jWnppURSJ6yb3JtRcsPISxIvu52Zszwyfx3uiuCOIDt8W0iiRnBz7Dn7twnzIpJqciJOh/pub
		String linje1 = scanner.nextLine();
		String linje2 = scanner.nextLine();
		String linje3 = scanner.nextLine();

		System.out.println(linje1);
		System.out.println(linje2);
		System.out.println(linje3);

		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
	}
}