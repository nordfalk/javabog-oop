package kapitel_19_ws;
import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public interface KontoI
{
	@WebMethod double c2f(double degrees);
	@WebMethod double f2c(double degrees);
}