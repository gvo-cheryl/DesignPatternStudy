package abstract_factory.prac01.factory.elevator;

import abstract_factory.prac01.door.Door;
import abstract_factory.prac01.motor.Motor;

public abstract class ElevatorFactory {
    public abstract Motor createMotor();
    public abstract Door createDoor();
}
