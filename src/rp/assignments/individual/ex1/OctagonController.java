package rp.assignments.individual.ex1;

import lejos.robotics.navigation.DifferentialPilot;
import rp.robotics.DifferentialDriveRobot;
import rp.systems.StoppableRunnable;

public class OctagonController implements StoppableRunnable {

	
	private float sideLength;
	private DifferentialPilot robot;
	
	
	public OctagonController(DifferentialDriveRobot robot, float sideLength ){
		this.robot = robot.getDifferentialPilot();
		this.sideLength = sideLength;
	}
	
	@Override
	public void run() {
		float sides = 0;
		while(sides < 8){
			robot.travel(sideLength);
			robot.rotate(45);
			sides++;
		}
		
	}

	@Override
	public void stop() {
		robot.stop();
		
	}

}
