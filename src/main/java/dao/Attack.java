package dao;

/**
 * Created by huangzhenzhen on 2017/8/1.
 */
public interface Attack {

    int attack(int othersHp);

    int normalAttack(int othersHp);

    int magicAttack(int othersHp);
}
