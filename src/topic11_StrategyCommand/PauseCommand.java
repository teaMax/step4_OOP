package topic11_StrategyCommand;

public class PauseCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Мы паузимся");
    }
}
