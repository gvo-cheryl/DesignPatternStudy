package abstract_factory.prac01.factory.elevator;

import abstract_factory.prac01.door.Door;
import abstract_factory.prac01.door.LGDoor;
import abstract_factory.prac01.motor.LGMotor;
import abstract_factory.prac01.motor.Motor;

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
