package github.gameheros;

import java.util.Random;

public class Knight extends Hero {

	public Knight(String name) {
		super(name);
		super.hp += 30; // +HP100
	}

	// Bash (Skill name)
	public void bash(Hero enemy) {
		enemy.hp -= 30;
		System.out.printf("[%s]의 ⤵ 배쉬 ⤵\n", this.name);
		System.out.printf("\t%s: %d\n", enemy.name, enemy.hp);
	}

	// 공격
	@Override
	public void Attack(Hero enemy) {
		if (new Random().nextBoolean())
			this.bash(enemy);
		else
			super.Attack(enemy);
	}

}
