package composite;

import composite.simple.Body;
import composite.simple.Computer;
import composite.simple.Keyboard;
import composite.simple.Monitor;

public class Client {

    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(5,2);
        Body body = new Body(100, 70);
        Monitor monitor = new Monitor(20,30);

        Computer computer = new Computer();
        computer.addKeyboard(keyboard);
        computer.addBody(body);
        computer.addMonitor(monitor);

        int computerPrice = computer.getPrice();
        int computerPower = computer.getPower();
        System.out.println("computerPrice : " + computerPrice + "만원");
        System.out.println("computerPower : " + computerPower + "W");

        System.out.println("===============================");

        ImprovedComputer imComputer = new ImprovedComputer();
        imComputer.addComponent(keyboard);
        imComputer.addComponent(body);
        imComputer.addComponent(monitor);

        int imComputerPrice = imComputer.getPrice();
        int imComputerPower = imComputer.getPower();
        System.out.println("imComputerPrice : " + imComputerPrice + "만원");
        System.out.println("imComputerPower : " + imComputerPower + "W");


    }
}
