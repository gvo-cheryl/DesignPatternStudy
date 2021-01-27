package strategy.weapon01;

public class Character {

    private Weapon weapon;

    public Weapon getWeapon() {
        weapon.attack();
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
