package kapitel_11;
import java.awt.*;
import javax.swing.*;

public class PanelMedBorderLayout extends JPanel
{
  JButton button1 = new JButton();
  JButton button2 = new JButton();
  JButton button3 = new JButton();
  JButton button4 = new JButton();
  JButton button5 = new JButton();

  BorderLayout borderLayout1 = new BorderLayout();

	public PanelMedBorderLayout() {
		try {
			jbInit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		button1.setText("NORTH");
		button2.setText("SOUTH");
		button3.setText("EAST");
		button4.setText("WEST");
		button5.setText("CENTER");

		this.setLayout(borderLayout1);

		this.add(button1, BorderLayout.NORTH);
		this.add(button2, BorderLayout.SOUTH);
		this.add(button3, BorderLayout.EAST);
		this.add(button4, BorderLayout.WEST);
		this.add(button5, BorderLayout.CENTER);
	}
}