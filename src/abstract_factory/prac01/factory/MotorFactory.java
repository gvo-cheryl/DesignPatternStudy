package abstract_factory.prac01.factory;

import abstract_factory.prac01.motor.HyunDaiMotor;
import abstract_factory.prac01.motor.LGMotor;
import abstract_factory.prac01.motor.Motor;

public class MotorFactory {

    public static Motor createMotor(VendorID venDerID){
        Motor motor = null;

        switch (venDerID){
            case LG:
                motor = new LGMotor();
                break;
            case HyunDai:
                motor = new HyunDaiMotor();
                break;
        }
        return motor;
    }
}
