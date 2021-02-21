package abstract_factory.prac01.factory.elevator;

import abstract_factory.prac01.door.Door;
import abstract_factory.prac01.door.HyunDaiDoor;
import abstract_factory.prac01.motor.HyunDaiMotor;
import abstract_factory.prac01.motor.Motor;

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
