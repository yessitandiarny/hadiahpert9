package appswing3;

import javax.swing.*;
 import java.awt.event.*;
public abstract class appswing3 implements ActionListener{

private static void createAndShowGUI () {
JFrame frame = new JFrame ("I am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.setBounds (20,30, 300, 100); 
frame.getContentPane().setLayout(null);
JButton butt=new JButton("Click me"); 
frame.getContentPane().add(butt);
butt.setBounds (20, 20, 200, 20);

appswing3 app = new appswing3() {};
app.label = new JLabel("nama saya merupakan");
app.label.setBounds (20,40, 200, 20); 
frame.getContentPane().add(app.label);

butt.addActionListener(app); 
frame.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	label.setText("ahyar ganteng sekali");
}

public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			createAndShowGUI();
		}
	});
}

JLabel label;
}