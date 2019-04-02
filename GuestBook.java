package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton Add= new JButton();
	JButton View = new JButton();
	String output = " ";
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		new GuestBook().CreateUI();
	}
	private void CreateUI() {
		// TODO Auto-generated method stub
		frame.add(panel);
		panel.add(Add);
		panel.add(View);
		Add.addActionListener(this);
		View.addActionListener(this);
		Add.setText("Add Name");
		View.setText("View Names");
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == Add) {
			String Name = JOptionPane.showInputDialog("Input a Name");
			names.add(Name);
	}
		
		if (arg0.getSource()== View) {
			for (int i = 1; i < names.size(); i++) {
				System.out.println(i);
				output += names.get(i)+"\n";
			}
			JOptionPane.showMessageDialog(null,output);
			
		}
	}
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
