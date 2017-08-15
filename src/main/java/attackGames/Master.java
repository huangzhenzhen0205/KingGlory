package attackGames;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class Master extends Heros implements Attack {


    @Override
    public int attack(int othersHp) {
        int attackType = (int) (Math.random() * 2);
        switch (attackType) {
            case 1:
                return normalAttack(othersHp);
            default:
                return magicAttack(othersHp);

        }

    }

    @Override
    public int normalAttack(int othersHp) {
        System.out.println(String.format("法师发动物理攻击，伤害=%s", this.ap));
        return othersHp - this.ap;
    }

    @Override
    public int magicAttack(int othersHp) {
        int skillType = (int) (Math.random() * 2);
        switch (skillType) {
            case 1:
                System.out.println(String.format("法师发动魔法，双倍攻击，伤害=%s", this.ap*2));
                return othersHp - this.ap*2;
            case 2:
                System.out.println(String.format("法师发动魔法，三倍攻击，伤害=%s", this.ap * 3));
                return othersHp - this.ap * 3;
            default:
                System.out.println(String.format("法师发动魔法，四倍攻击，伤害=%s", this.ap * 4));
                return othersHp - this.ap * 4;
        }
    }
}
