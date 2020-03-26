package github.gameheros;

import java.util.Random;

public class Hero {

    protected String name;
    protected int hp = 100;

    // 생성자
    public Hero(String name) {
        this.name = name;
    }

    // Punch
    public void Punch(Hero enemy) {
        enemy.hp -= 10;
        System.out.printf("[%s]의 ☞ 펀치 ☞\n", this.name);
        System.out.printf("\t%s: %d/100\n", enemy.name, enemy.hp);
    }

    //공격
    public void Attack(Hero enemy) {
        Punch(enemy);
    }

}
