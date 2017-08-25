package rent;

/**
 * 客车
 * Created by huangzhenzhen on 2017/8/7.
 */
public class Coach extends Vehicle implements CarryPassenger {

    private int newPeople;

    public Coach(int id, String name, double price, int newPeople) {
        this.setPeople(newPeople);
        super.setCarId(id);
        super.setName(name);
        super.setPrice(price);

    }

    @Override
    public void setPeople(int newPeople) {
        this.newPeople = newPeople;
    }

    @Override
    public int getPeople() {
        return newPeople;
    }

    @Override
    public String toString() {
        return this.getCarId()+"\t"+this.getName()+"\t"+this.getPrice()+"元/天\t"+"载人数"+this.getPeople();
    }
}
