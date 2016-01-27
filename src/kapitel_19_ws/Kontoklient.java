/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_19_ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author j
 */
public class Kontoklient {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:9901/kontotjeneste?wsdl");
		QName qname = new QName("http://kapitel_19_ws/", "KontoImplService");
		Service service = Service.create(url, qname);
		qname = new QName("http://kapitel_19_ws/", "KontoImplPort");
		KontoI k = service.getPort(qname, KontoI.class);
    
    k.overførsel(100);
    k.overførsel(50);
		System.out.println( "Saldo er: "+ k.saldo() );
		k.overførsel(-200);
		k.overførsel(51);
		System.out.println( "Saldo er: "+ k.saldo() );
		ArrayList<String> bevægelser = k.bevægelser();

		System.out.println( "Bevægelser er: "+ bevægelser );
	}
}
