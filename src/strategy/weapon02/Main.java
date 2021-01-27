package strategy.weapon02;

public class Main {

    public static void main(String[] args) {

        Character character = new Character();
        character.setWeapon(new Bom());
        character.attack();
    }
}
