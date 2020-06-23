package tr.com.selcuk.abs;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class AFrame extends JFrame {
	
	public void initFrame(String title,JPanel panel) {
		
		add(panel);
		setTitle(title);
        pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public abstract JPanel initPanel();
	

}
