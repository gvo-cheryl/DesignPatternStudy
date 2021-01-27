package strategy.weapon02;

public class Character {

    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // 바로 어택할 수 있는 메소드 생성
    public void attack() {

        if(weapon==null){
            System.out.println("배치기!!!");
        } else {
            this.weapon.attack();
        }
        this.weapon = weapon;
    }
}
