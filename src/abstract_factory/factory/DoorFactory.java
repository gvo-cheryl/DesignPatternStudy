package abstract_factory.factory;

import abstract_factory.door.Door;
import abstract_factory.door.HyunDaiDoor;
import abstract_factory.door.LGDoor;

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
