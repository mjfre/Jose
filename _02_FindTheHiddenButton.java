/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] butt;
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Random rand = new Random();
		
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String user = JOptionPane.showInputDialog("Pick a positive number");
		int num = Integer.parseInt(user);
		
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		butt = new JButton[num];
		//5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < num; i++) {
			System.out.println(i + " " + num);
			butt[i]=new JButton();
			butt[i].addActionListener(this);
			panel.add(butt[i]);
		}
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		window.add(panel);
		//9 add the panel to the window
		
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Look for the hidden button");
		//13. initialize the hiddenButton variable to a random number less than the int created int step 3
		hiddenButton=rand.nextInt(num);
		//14. Set the text of the JButton located at hiddenButton the read "ME"
		
 		//15. Use Thread.sleep(100); to pause the program.
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//    Surround it with a try/catch
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
		butt[hiddenButton].setText(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		butt[hiddenButton].setText("Me");
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(e.getSource()==butt[hiddenButton]) {
			JOptionPane.showMessageDialog(null,"You win!!");
		}
		else {
			JOptionPane.showMessageDialog(null,"try again");
		}
		//18. else tell them to try again
	}
}
