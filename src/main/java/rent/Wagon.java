package rent;

/**
 * 客货两用车
 * Created by huangzhenzhen on 2017/8/22.
 */
public class Wagon extends Vehicle implements CarryPassenger, Cargo {
    private int newPeople;
    private int newGoods;


    public Wagon(int id, String name, double price, int newPeople, int newGoods) {
        this.setCarId(id);
        this.setName(name);
        this.setPrice(price);
        this.setPeople(newPeople);
        this.setGoods(newGoods);
    }

    @Override
    public void setGoods(int ton) {

    }

    @Override
    public int getGoods() {
        return 0;
    }

    @Override
    public void setPeople(int p) {

    }

    @Override
    public int getPeople() {
        return 0;
    }

    @Override
    public String toString() {
        return this.getCarId() + "\t" + this.getName() + "\t" + this.getPrice() + "元/天\t" + "载人数" + this.getPeople() + "\t载货" + this.getGoods();

    }
}
