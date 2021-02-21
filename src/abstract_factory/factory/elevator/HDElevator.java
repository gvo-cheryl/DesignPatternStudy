package abstract_factory.factory.elevator;

import abstract_factory.door.Door;
import abstract_factory.door.HyunDaiDoor;
import abstract_factory.motor.HyunDaiMotor;
import abstract_factory.motor.Motor;

public class HDElevator extends ElevatorFactory{
    @Override
    public Motor createMotor() {
        return new HyunDaiMotor();
    }

    @Override
    public Door createDoor() {
        return new HyunDaiDoor();
    }
}
