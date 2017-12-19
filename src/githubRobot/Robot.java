package githubRobot;

import github.Robot.InterFace.IFly;
import github.Robot.InterFace.IMissile;
import github.Robot.InterFace.Iknife;

public abstract class Robot {

	public Robot() {

	}

	public void walk() {
		System.out.println("걷기");
	}

	public void run() {
		System.out.println("달리기");
	}
	public abstract void shape();
	
	IFly fly;
	IMissile missile;
	Iknife knife;

	public void setFly(IFly fly) {
		this.fly = fly;
	}
	public void setMissile(IMissile missile) {
		this.missile = missile;
	}
	public void setIknife(Iknife iknife) {
		this.knife = iknife;
	}
	
	public void actionKnife() {
		this.knife.knife();
	}
	
	public void actionMissile() {
		this.missile.missile();
	}
	
	public void actionFly() {
		this.fly.fly();
	}
	
}
