package abstract_factory.factory;

import abstract_factory.motor.LGMotor;
import abstract_factory.motor.HyunDaiMotor;
import abstract_factory.motor.Motor;

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
