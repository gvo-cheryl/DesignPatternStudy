package singleton;

public class Printer {

    // 경합조건 해결방법1 : 정적변수에 인스턴스를 만들어 초기하는 방법
    // private static Printer printer = new Printer();
    private static Printer printer = null;
    private int counter = 0;
    private Printer(){

    }

    // 경합조건 해결방법2 : 인스턴스를 만드는 메서드에 동기화하는 방법
    // (임계구역)
    public static Printer getPrinter(){
        if(printer == null) {
            printer = new Printer(); // Printer 인스턴스 생성
        }
        return printer;
    }

    public void print(String str){
        // 오직 하나의 스레드만 접근을 허용(임계구역)
        // 성능을 위해 필요한 부분만을 임계구역으로 설정
        synchronized (this){
            counter++;
            System.out.println(str);
        }
    }

}
