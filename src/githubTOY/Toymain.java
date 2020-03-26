package githubTOY;

public class Toymain {
    public static void main(String[] args) {
        System.out.println("      미사일 발사  불빛 발사  팔다리 움직임");
        System.out.println("토 르    X            X           O ");
        System.out.println("헐 크    O            X           O ");
        System.out.println("곰돌이   O            O           X ");
        System.out.println("");
        Toy tor = new Torr();
        Toy hulk = new Hulk();
        Toy bear = new Bear();

    }
}
