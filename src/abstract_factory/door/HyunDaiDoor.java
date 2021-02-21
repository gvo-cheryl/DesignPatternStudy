package abstract_factory.door;

public class HyunDaiDoor extends Door{
    @Override
    protected void doClose() {
        System.out.println("close HD Door");
    }

    @Override
    protected void doOpen() {
        System.out.println("open HD Door");
    }
}
