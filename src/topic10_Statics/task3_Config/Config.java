package topic10_Statics.task3_Config;

public class Config {
    private static final String configVersion;

    static
    {
        configVersion = "v1.0.0";
    }

    public static void displayConfig() {
        System.out.println("Текущая конфигурация: " + configVersion);
    }
}
