package kapitel_19_ws;

import javax.xml.ws.Endpoint;

class Kontoserver {
	public static void main(String[] args) {
		System.out.println("publicerer kontotjeneste");
		Endpoint.publish("http://[::]:9901/kontotjeneste", new KontoImpl());
// listen on all Ipv6 addresses
// use 0.0.0.0 for Ipv4 or use hostname
		System.out.println("Kontotjeneste publiceret.");
	}
}
