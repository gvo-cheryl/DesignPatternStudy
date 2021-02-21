package abstract_factory.prac01.motor;

import abstract_factory.prac01.door.Door;

enum MotorStatus  {MOVING, STOP};
public abstract class Motor {

    private MotorStatus motorStatus;
    private Door door;

    public Motor() {
        motorStatus = MotorStatus.STOP;
    }

    public MotorStatus getMotorStatus() {
        return this.motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }


    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if(motorStatus == MotorStatus.MOVING){
            return;
        }

        door.close();
        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);

    public void setDoor(Door door){
        this.door = door;
    }
}
