package topic11_StrategyCommand;

public class StartCommand implements Command{
    @Override
    public void execute(){
        System.out.println("Мы стартуем");
    }
}
