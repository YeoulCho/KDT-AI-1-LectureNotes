package interfaceTest.character;

import interfaceTest.Skill;
import utility.random.CustomRandom;

public class Monster implements Skill {
    int strength;       // 완력
    int intelligent;    // 지능
    int dexterity;      // 재주
    int agility;        // 민첩
    int hp;

    final int START = 20;
    final int END = 30;
    final int HP_MIN = 200;
    final int HP_MAX = 300;

    public Monster () {
        this.strength = CustomRandom.generateNumber(START, END);
        this.intelligent = CustomRandom.generateNumber(START, END);
        this.dexterity = CustomRandom.generateNumber(START, END);
        this.agility = CustomRandom.generateNumber(START, END);
        this.hp = CustomRandom.generateNumber(HP_MIN, HP_MAX);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void firstSkill(Monster target) {

    }

    @Override
    public void secondSkill() {

    }

    @Override
    public String toString() {
        return "Monster{" +
                "strength=" + strength +
                ", intelligent=" + intelligent +
                ", dexterity=" + dexterity +
                ", agility=" + agility +
                ", hp=" + hp +
                '}' + '\n';
    }
}
