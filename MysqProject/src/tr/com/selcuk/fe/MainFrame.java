package tr.com.selcuk.fe;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tr.com.selcuk.abs.AFrame;

public class MainFrame extends AFrame{

	public MainFrame() {
	initFrame (500,600,"M��teri Ekle",initPanel());
	}

	@Override
	public JPanel initPanel() {
	JPanel panel= new JPanel(new GridLayout(3,2));
	JLabel nameJLabel=new JLabel("Ad�:",JLabel.RIGHT);
	panel.add(nameJLabel);
	
	JTextField nameField = new JTextField(10);
	panel.add(nameField);
	JLabel surnameJLabel =new JLabel ("Soyad�:",JLabel.RIGHT);
	panel.add(surnameJLabel);
	JTextField surnameField =new JTextField(10);
	panel.add(surnameField);
	
	JButton saveButton=new JButton("Kaydet");
	panel.add(saveButton);
	JButton updateButton=new JButton("D�zenle");
	panel.add(updateButton);
	
	
;
	
	
		return panel;
	}

}
