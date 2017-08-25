package rent;

import java.util.Scanner;

/**
 * Created by huangzhenzhen on 2017/8/24.
 */
public class RentSystem {
    Vehicle[] car = {new Coach(1, "奥迪A4", 500, 4), new Coach(2, "马自达", 400, 4), new Wagon(3, "皮卡雪", 450, 4, 20), new Coach(4, "金龙", 800, 20), new Truck(5, "松花江", 400, 4), new Truck(6, "依维柯", 1000, 20)};
    Scanner scanner = new Scanner(System.in);

    public void rentSystem() {
        
        System.out.println("欢迎使用答答租车系统： \n是否租车 1是 0否");
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("您可租车的类型和价目表： " + "\n序号" + "\t" + "车名" + "\t" + "租金" + "\t" + " \t" + "容量");
            for (int i = 0; i < car.length; i++) {
                System.out.println(car[i]);
            }
        }else if (input==0){
            System.out.println("欢迎下次光临");
        }else {
            System.out.println("输入有误，请确认后输入正确命令");
        }


    }
}
