package strategy.abstract02;

public class CalMachine extends Calculator{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        double sum = 0;
        for(int i =0; i<a.length; i++){
            sum+=a[i];
        }
        return sum/a.length;
    }

    public static void main(String[] args) {
        CalMachine calMachine = new CalMachine();
        System.out.println(calMachine.add(1,2));
        System.out.println(calMachine.subtract(3,5));
        System.out.println(calMachine.average(new int[]{1,2,3,4}));
    }
}
