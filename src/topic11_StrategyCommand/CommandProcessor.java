package topic11_StrategyCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProcessor {
    static Map<String, Command> commandMap = new HashMap<>();

    public CommandProcessor() {
        commandMap.put("pause", new PauseCommand());
        commandMap.put("start", new StartCommand());
        commandMap.put("stop", new StopCommand());
    }

    public static Command getCommandByKey(String key) {
        new CommandProcessor();
        return commandMap.get(key);
    }
}
