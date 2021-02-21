package abstract_factory.prac01.factory;

import abstract_factory.prac01.door.Door;
import abstract_factory.prac01.door.HyunDaiDoor;
import abstract_factory.prac01.door.LGDoor;

public class DoorFactory {

    public static Door createDoor(VendorID vendorID){
        Door door = null;

        switch (vendorID){
            case LG:
                door = new LGDoor(); break;
            case HyunDai:
                door = new HyunDaiDoor(); break;
        }
        return door;
    }
}
