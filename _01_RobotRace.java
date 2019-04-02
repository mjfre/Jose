package arrays;

import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Random randy = new Random();
		Robot[] bobby= new Robot[5];
		for (int i = 0; i < bobby.length; i++) {
			bobby[i]= new Robot();
			int y =100;
		}
		bobby[0].moveTo(50, 560);
		bobby[1].moveTo(150,560);
		bobby[2].moveTo(250,560);
		bobby[3].moveTo(350, 560);
		bobby[4].moveTo(450, 560);
		
	//2. create an array of 5 robots.
		
		boolean finished= false;
		while(!finished) {
			for (int i = 0; i < bobby.length; i++) {
				bobby[0].move(randy.nextInt(100));
				bobby[1].move(randy.nextInt(100));
				bobby[2].move(randy.nextInt(100));
				bobby[3].move(randy.nextInt(100));
				bobby[4].move(randy.nextInt(100));
				int q = bobby[0].getY();
				int w = bobby[1].getY();
				int e = bobby[2].getY();
				int r = bobby[3].getY();
				int t = bobby[4].getY();
				if (q<100) {
				finished=true;
				}
				else if(w<100) {
				finished=true;	
				}
				else if(e<100) {
				finished=true;	
				}
				else if(r<100) {
				finished=true;	
				}
				else if(t<100) {
				finished=true;	
				}
					
				}
			}
		}
	//3. use a for loop to initialize the robots.
		//4. make each robot start at the bottom of the screen, side by side, facing up
		
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}

