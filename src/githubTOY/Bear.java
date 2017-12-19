package githubTOY;

public class Bear implements Missile, Light {

	public Bear() {
		
		System.out.println("곰돌이");
		shootM();
		shineL();
		System.out.println("=======");
	}
	
	@Override
	public void shineL() {
		System.out.println("불빛 발사");
		
	}

	@Override
	public void shootM() {
		System.out.println("미사일 발사");
		
	}

}
