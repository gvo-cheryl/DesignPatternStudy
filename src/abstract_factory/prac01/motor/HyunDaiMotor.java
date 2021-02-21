package abstract_factory.prac01.motor;

public class HyunDaiMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move HD Motor : " + direction);
    }
}
