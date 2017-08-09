package dao;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class Test {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.name = "战士";
        soldier.ap = 10;
        soldier.hp = 100;

        Master master = new Master();
        master.name = "法师";
        master.ap = 20;
        master.hp = 100;


        System.out.println("游戏开始");

        int count = 0;
        while (soldier.hp > 0 && master.hp > 0) {
            count++;
            System.out.println(String.format("第%s回合", count));
            soldier.hp = master.attack(master.hp);
            master.hp = soldier.attack(soldier.hp);

            System.out.println(String.format("当前血量: 战士：%s 法师：%s", soldier.hp, master.hp));

        }
    }
}



