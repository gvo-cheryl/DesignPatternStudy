package composite;

public class Computer {

    private Body body;
    private Keyboard keyboard;
    private Monitor monitor;

    public void addBody(Body body){
        this.body = body;
    }

    public void addKeyboard(Keyboard keyboard){
        this.keyboard = keyboard;
    }

    public void addMonitor(Monitor monitor){
        this.monitor = monitor;
    }

    public int getPrice(){
        int keyboardPrice = keyboard.getPrice();
        int bodyPrice = body.getPrice();
        int monitorPrice = monitor.getPrice();
        return keyboardPrice + bodyPrice + monitorPrice;
    }

    public int getPower(){
        int keyboardPower = keyboard.getPower();
        int bodyPower = body.getPower();
        int monitorPower = monitor.getPower();
        return keyboardPower + bodyPower + monitorPower;
    }
}
