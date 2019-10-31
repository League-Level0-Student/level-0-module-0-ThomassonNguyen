package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	
public static void main(String[] args) {

Robot League = new Robot();

 League.penDown();
League.setSpeed(100);

League.move(100);
League.turn(90);	
League.move(50);	
League.turn(180);
League.move(100);
	
}
	
}


