package github.gameheros;

import java.util.Random;

public class GameHero {

	private String name;
	private int hp = 100;
	
	//생성자
	public GameHero(String name) {
		this.name = name;
	}
	//Punch (펀치로 승부를 보는 게임)
	public void Punch(GameHero enemy) {
		enemy.hp -= 10;
		System.out.printf("[%s]의 펀치\n", this.name);
		System.out.printf("\t%s: %d/100\n", enemy.name, enemy.hp);
		}
	public static void main(String[] args) throws InterruptedException {
		
		GameHero Hulk = new GameHero("HULK");
		GameHero SpiderMan = new GameHero("SpiderMan");
		
		Random random = new Random();
		while ( Hulk.hp > 0 && SpiderMan.hp > 0) {
			Boolean HulkTurn = random.nextBoolean();
			GameHero attacker = HulkTurn ? Hulk : SpiderMan;
			GameHero defender = HulkTurn ? SpiderMan : Hulk;
			
			
			attacker.Punch(defender);
			Thread.sleep(100);
		}
	}

}
