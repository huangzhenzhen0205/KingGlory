package rent;

/**
 * Created by huangzhenzhen on 2017/8/7.
 */
public abstract class Vehicle {
    private String name;  //名称
    private double price;//价目
    private int carId;   //编号

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

}
