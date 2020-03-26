package github.gameheros;

import java.util.Random;

public class Wizard extends Hero {
    // 생성자
    public Wizard(String name) {
        super(name);
        super.hp += 30; // +HP100
    }

    // Bash (Skill name)
    public void fireball(Hero enemy) {
        enemy.hp -= 30;
        System.out.printf("[%s]의 ★ 파이어볼 ★\n", this.name);
        System.out.printf("\t%s: %d\n", enemy.name, enemy.hp);
    }

    // 공격
    @Override
    public void Attack(Hero enemy) {
        if (new Random().nextBoolean())
            this.fireball(enemy);
        else
            super.Attack(enemy);
    }

}
