package kapitel_19_ws;

import javax.jws.WebService;

@WebService(endpointInterface = "kapitel_19_ws.KontoI")
public class KontoImpl implements KontoI {
	public double c2f(double degrees) {
		return degrees * 9.0 / 5.0 + 32;
	}

	public double f2c(double degrees) {
		System.out.println("f2c blev kaldt!! med "+degrees);
		return (degrees - 32) * 5.0 / 9.0;
	}
}
