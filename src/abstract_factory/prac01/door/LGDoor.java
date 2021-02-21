package abstract_factory.prac01.door;

public class LGDoor extends Door{
    @Override
    protected void doClose() {
        System.out.println("close LG Door");
    }

    @Override
    protected void doOpen() {
        System.out.println("open LG Door");
    }
}
