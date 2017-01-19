package rp.assignments.individual.ex1;

import lejos.robotics.navigation.DifferentialPilot;
import rp.robotics.DifferentialDriveRobot;
import rp.systems.StoppableRunnable;

public class NonagonController implements StoppableRunnable{

	
    private float sideLength;
    private DifferentialPilot robot;
    
    public NonagonController(DifferentialDriveRobot robot, float sideLength){
    	this.sideLength = sideLength;
    	this.robot = robot.getDifferentialPilot();
    }
	@Override
	public void run() {
		float sides = 0;
		while(sides < 10){
			robot.travel(sideLength);
			robot.rotate(40);
			sides++;
		}
		
	}

	@Override
	public void stop() {
		robot.stop();
	}
	
}
