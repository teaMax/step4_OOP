package topic10_Statics.task1_Counter;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counterFirst = new Counter();
        Counter counterSecond = new Counter();
        Counter counterThird = new Counter();
        Counter counterFourth = new Counter();

        System.out.println(Counter.getCount());
    }
}
