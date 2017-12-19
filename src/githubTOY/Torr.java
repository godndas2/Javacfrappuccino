package githubTOY;

public class Torr implements CanMoving{

	public Torr() {
		
		System.out.println("토르");
		canMoveArmLeg();
		System.out.println("=======");
	}
	@Override
	public void canMoveArmLeg() {
	System.out.println("팔다리를 움직일 수 있습니다.");	
	}
	

}
