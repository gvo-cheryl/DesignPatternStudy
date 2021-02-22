package composite;

import strategy.abstract01.C;

import java.util.ArrayList;
import java.util.List;

public class ImprovedComputer extends ComputerDevice{

    // 복수개의 ComputerDevice 객체를 가리킴
    private List<ComputerDevice> components = new ArrayList<ComputerDevice>();

    public void addComponent(ComputerDevice computerDevice){
        components.add(computerDevice);
    }

    public void removeComponent(ComputerDevice computerDevice){
        components.remove(computerDevice);
    }

    @Override
    public int getPrice() {
        int price = 0;
        for(ComputerDevice component: components){
            price += component.getPrice();
        }
        return price;
    }

    @Override
    public int getPower() {
        int power = 0;
        for(ComputerDevice component: components){
            power += component.getPower();
        }
        return power;
    }
}
