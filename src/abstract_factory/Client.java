package abstract_factory;

import abstract_factory.door.Door;
import abstract_factory.factory.DoorFactory;
import abstract_factory.factory.MotorFactory;
import abstract_factory.factory.VendorID;
import abstract_factory.factory.elevator.ElevatorFactory;
import abstract_factory.factory.elevator.LGElevator;
import abstract_factory.motor.Direction;
import abstract_factory.motor.HyunDaiMotor;
import abstract_factory.motor.Motor;
import abstract_factory.door.LGDoor;

public class Client {

    public static void main(String[] args) {
        // 추상 팩토리
        Door lgDoor = new LGDoor();
        Motor lgMotor = new HyunDaiMotor();

        lgMotor.setDoor(lgDoor);
        lgDoor.open();
        lgMotor.move(Direction.UP);

        System.out.println("==========================");

        // 팩토리 메소드를 통해 객체 생성을 캡슐화
        Door hdDoor = DoorFactory.createDoor(VendorID.HyunDai);
        Motor hdMotor = MotorFactory.createMotor((VendorID.HyunDai));

        hdMotor.setDoor(hdDoor);
        hdDoor.open();
        hdMotor.move(Direction.UP);

        /*
        * 문제점
        * 1. 다른 업체의 부품을 사용해야하는 경우
        * 2. 새로운 업체의 부품을 지원해야하는 경우
        *
        * 여러 종류의 객체를 생성할 때 객체들 사이의 관련성이 있는경우,
        * 각 종류별로 별도의 Factory를 사용하는 대신
        * 관련 객체들을 일관성 있게 생성하는 Factory클래스를 사용
        * */

        System.out.println("==========================");

        ElevatorFactory elevatorFactory = new LGElevator();
        Door door = elevatorFactory.createDoor();
        Motor motor = elevatorFactory.createMotor();

        motor.setDoor(door);
        door.open();
        motor.move(Direction.UP);


    }
}
