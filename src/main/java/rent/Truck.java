package rent;

/**
 * 货车
 * Created by huangzhenzhen on 2017/8/22.
 */
public class Truck extends Vehicle implements Cargo {
    private int newGoods;

    public Truck(int id, String name, double price, int newGoods) {
        super.setCarId(id);
        super.setName(name);
        super.setPrice(price);
        this.newGoods = newGoods;
    }

    @Override
    public void setGoods(int newGoods) {
        this.newGoods = newGoods;
    }

    @Override
    public int getGoods() {
        return newGoods;
    }

    @Override
    public String toString() {
        return this.getCarId() + "\t" + this.getName() + "\t" + this.getPrice() + "元/天\t" + "载货" + this.getGoods() + "吨";

    }
}
