package kapitel_09;
import java.awt.*;
import java.awt.image.*;

public class AktivVisningFuldskaermBufferet extends AktivVisningFuldskaerm
{
	public static void main(String[] args)
	{
		AktivVisning vindue = new AktivVisning();
		initFuldskærm(vindue);
		vindue.init();
		vindue.createBufferStrategy(2);   // opret 2 buffere
		BufferStrategy bufferStrategy = vindue.getBufferStrategy();

		for (int i=0; i<10000; i++) {
			vindue.g2 = (Graphics2D) bufferStrategy.getDrawGraphics(); // få buffer
			vindue.tegn();            // tegn på bufferens (med dens Graphics-objekt)
			bufferStrategy.show();    // vis grafikken EFTER at der er tegnet færdigt
			vindue.g2.dispose();      // frigiv bufferen så den er klar til genbrug
		}
	}
}