package composite;

public class Monitor extends ComputerDevice{

    private int price;
    private int power;

    public Monitor(int power, int price) {
        this.price = price;
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }
}
