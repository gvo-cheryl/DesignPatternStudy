package strategy.abstract01;

public class C extends A{

    @Override
    int add(int x, int y) {
        return x + y;
    }

    void show(){
        System.out.println("C");
    }
}
