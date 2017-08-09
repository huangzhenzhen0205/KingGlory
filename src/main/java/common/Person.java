package common;

import java.util.Random;

/**
 * Created by huangzhenzhen on 2017/8/2.
 */
public class Person {
    private int blood;// 初始血量
    private int range;// 掉血范围
    private String name;// 姓名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    // 构造函数
    public Person(String name, int blood, int range) {
        this.name = name;
        this.blood = blood;
        this.range = range;
    }

    // 击打
//    public void beat(Person person) {
//        int bleeding = person.hurt();
//        System.out.println(String.format("%s打了%s一耳光,%s流了%s滴血。", this.name, person.getName(), person.getName(), bleeding));
//    }

    // 被打，受伤
    public int hurt(Person person) {
        Random random = new Random();
        int bleeding = random.nextInt(this.range) + 1;
        if (bleeding > this.blood) {
            bleeding = this.blood;
        }
        this.blood -= bleeding;
        System.out.println(this.name + "打了" + person.getName() + "一耳光," + person.getName() + "流了" + bleeding + "滴血。");
        return bleeding;
//        System.out.println(String.format("%s打了%s一耳光,%s流了%s滴血。", this.name, person.getName(), person.getName(), bleeding));

    }

    // 输出状态
    public void printState() {
        if (this.blood == 0) {
            System.out.println(String.format("%s被打死了", this.name));
        } else {
            System.out.println(String.format("%s还剩%s滴血", this.name, this.blood));
        }
    }
}
