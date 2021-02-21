package singleton;

import singleton.static_methods.UserThread;

public class Client {

    private  static final int USER_NUM = 5;
    private  static final int THREAD_NUM = 5;

    public static void main(String[] args) {
        User[] user = new User[USER_NUM];

        for(int i=0; i< USER_NUM; i++){
            user[i] = new User("User" + (i+1));
            user[i].print();
        }

        /*
        * 문제점 >> 경합 조건(Race Condition) 을 발생시키는 경우
        * 1) Printer 인스턴스가 아직 생성되지 않았을 때 스게드 1이 getPrinter 메서드의 if문을 실행해
        *    이미 인스턴스가 생성되었는지 확인한다. 현재 printer 변수는 null인 상태다.
        * 2) 만약 스레드 1이 생성자를 호출해 인스턴스를 만들기 전 스레드 2가 if문을 실행해 printer 변수가 null인지 확인한다.
        *    현재 printer 변수는 null이므로 인스턴스를 생성하는 생성자를 호출하는 코드를 실행하게 된다.
        * 3) 스레드 1도 스레드 2와 마찬가지로 인스턴스를 생성하는 코드를 실행하게 되면
        *    결과적으로 Printer 클래스의 인스턴스가 2개 생성된다.
        * */

        // 해결방법1. 정적 변수에 인스턴스를 만들어 바로 초기화하는 방법(Eager Initialization)
        // 해결방법2. 인스턴스를 만드는 메서드에 동기화하는 방법(Thread-Safe Initialization)

        System.out.println("==============================");

        // 정적메서드로만 이루어진 정적클래스를 사용하여 싱글턴과 동일한 효과를 얻을 수 있다.
        // 차이점1 : 정적클래스를 이용하면 객체를 전혀 사용하지 않고 메서드를 사용한다.
        // 차이점2 : 정적메서드를 사용하므로 일반적으로 실핼할 때 바인딩되는(컴파일 타임에 바인딩되는)
        //         인스턴스 메서드를 사용하는 것보다 성능면세어 우수하다.
        // 단, 인터페이스를 구현해야 하는 경우, 정적메서드는 인터페이스에서 사용할 수 없다.
        UserThread[] userThread = new UserThread[THREAD_NUM];
        for(int i=0; i<USER_NUM; i++){
            userThread[i] = new UserThread("UserThread" + (i+1));
            userThread[i].start();
        }
    }
}
