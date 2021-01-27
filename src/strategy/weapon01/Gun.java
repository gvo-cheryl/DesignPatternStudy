package strategy.weapon01;

public class Gun implements Weapon{
    @Override
    public void attack() {
        System.out.println("총 공격!!!");
    }
}
