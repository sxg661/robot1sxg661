package rp.assignments.individual.ex1;

import lejos.robotics.navigation.DifferentialPilot;
import rp.robotics.DifferentialDriveRobot;
import rp.robotics.MobileRobot;
import rp.systems.StoppableRunnable;

/**
 * 
 * A placeholder to show you how you could start writing a controller for the
 * first part of the first individual assignment (creating a controller which
 * drives in a pentagon). Note that you don't have to follow this structure for
 * your controller as there are more elegant and efficient (at least in terms of
 * numbers of lines of code) in which you can implement the different shape
 * controllers.
 * 
 * @author Nick Hawes
 *
 */
public class PentagonController implements StoppableRunnable {
	
	private float sideLength;
	private DifferentialPilot robot;
	
	
	public PentagonController(DifferentialDriveRobot robot, float sideLength) {
		this.robot = robot.getDifferentialPilot();
		this.sideLength = sideLength;
	}

	@Override
	public void run() {
		int sides = 0;
		while(sides < 5){
			robot.travel(sideLength);
			robot.rotate(72);
			sides++;
		}
	}

	@Override
	public void stop() {
		  robot.stop();
	}

}
