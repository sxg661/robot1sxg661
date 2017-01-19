package rp.assignments.individual.ex1;

import lejos.robotics.navigation.DifferentialPilot;
import rp.robotics.DifferentialDriveRobot;
import rp.robotics.TouchSensorEvent;
import rp.systems.ControllerWithTouchSensor;
import rp.util.Rate;

public class BumperController implements ControllerWithTouchSensor {

	private DifferentialPilot robot;
	private boolean isPressed;

	public BumperController(DifferentialDriveRobot robot) {
		this.robot = robot.getDifferentialPilot();
		this.isPressed = false;

	}

	@Override
	public void stop() {
		robot.stop();
	}

	@Override
	public void run() {
		Rate r= new Rate(40);
		while (true) {
			robot.forward();
		    r.sleep();
		    if(isPressed){
		    	robot.backward();
		  
		    	robot.stop();
		    	
		    	robot.rotate(180);
		    	
		    	isPressed = false;
		    }
		}
	}

	@Override
	public void sensorPressed(TouchSensorEvent _e) {
		if (_e.getOldValue() > _e.getNewValue()){
			isPressed = true;
		}
		    
	}

	@Override
	public void sensorReleased(TouchSensorEvent _e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sensorBumped(TouchSensorEvent _e) {
		// TODO Auto-generated method stub

	}

}
