package strategy.weapon01;

public class Main {

    public static void main(String[] args) {

        // 원하는 공격으로 생성자를 지정하여 set해주고
        // 해당 공격을 가져와 연결된 attack 실행
        Character character = new Character();
        character.setWeapon(new Bom());
        character.getWeapon().attack();

    }
}
