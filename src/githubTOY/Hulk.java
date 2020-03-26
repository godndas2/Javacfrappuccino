package githubTOY;

public class Hulk implements Missile, CanMoving {

    public Hulk() {

        System.out.println("헐크");
        shootM();
        canMoveArmLeg();
        System.out.println("=======");
    }

    @Override
    public void canMoveArmLeg() {
        // TODO Auto-generated method stub
        System.out.println("팔다리를 움직일 수 있습니다.");
    }

    @Override
    public void shootM() {
        // TODO Auto-generated method stub
        System.out.println("미사일 발사");
    }


}
