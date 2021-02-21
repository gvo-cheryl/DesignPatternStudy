package abstract_factory.motor;

public class HyunDaiMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move HD Motor : " + direction);
    }
}
