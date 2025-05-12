package topic11_StrategyCommand;

public class StopCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Мы стопимся");
    }
}
