package topic9_String.task2_StringComparison;

public class StringComparison {
    public static void main(String[] args) {
        String firstStr = "Apple";
        String secondStr = new String("Apple");

        System.out.println(firstStr == secondStr);
        System.out.println(firstStr.equals(secondStr));
    }
}
