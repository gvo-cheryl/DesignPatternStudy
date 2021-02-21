package abstract_factory.motor;

public class LGMotor extends Motor{
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move LG Motor : " + direction);
    }
}
