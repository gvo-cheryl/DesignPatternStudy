package abstract_factory.factory.elevator;

import abstract_factory.door.Door;
import abstract_factory.motor.Motor;

public abstract class ElevatorFactory {
    public abstract Motor createMotor();
    public abstract Door createDoor();
}
