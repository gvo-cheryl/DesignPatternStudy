package strategy.abstract01;

public class Main {

    public static void main(String[] args) {
        A a = new C();
        int sum = a.add(1,2);
        System.out.println("a의 합 : " + sum);

        C c = new C();
        int sum2 = c.add(2,4);
        c.show();
        System.out.println("c의 합 : " +sum2);
    }
}
