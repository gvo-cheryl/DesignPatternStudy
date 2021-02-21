package singleton.static_methods;

public class UserThread extends Thread{

    public UserThread(String name){
        super(name);
    }

    public void run(){
        SyncPrinter.print(Thread.currentThread().getName());
    }
}
