package topic10_Statics.task1_Counter;

public class Counter {
    private static int count;

    public Counter(){
        count++;
    }

    public static int getCount() {
        return count;
    }
}
