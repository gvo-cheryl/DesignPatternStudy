package abstract_factory.factory.elevator;

import abstract_factory.door.Door;
import abstract_factory.door.LGDoor;
import abstract_factory.motor.LGMotor;
import abstract_factory.motor.Motor;

public class LGElevator extends ElevatorFactory{

    @Override
    public Motor createMotor() {
        return new LGMotor();
    }

    @Override
    public Door createDoor() {
        return new LGDoor();
    }
}
