package githubRobot;

import github.Robot.InterFace.FlyYes;
import github.Robot.InterFace.KnifeRazer;
import github.Robot.InterFace.MissileYes;

public class MainClass {
//Super,Standard,Low robot
	public static void main(String[] args) {
		
	System.out.println("Super Robot을 만들어 주세요");
	Robot superRobot = new SuperR();
	superRobot.shape();
	superRobot.walk();
	superRobot.run();
	superRobot.setFly(new FlyYes());
	superRobot.actionFly();
	superRobot.setMissile(new MissileYes());
	superRobot.actionMissile();
	superRobot.setIknife(new KnifeRazer());
	superRobot.actionKnife();
	}
}
