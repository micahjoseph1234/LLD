package abstractFactory;

public class MacButton implements AppButton{
    @Override
    public void paint()
    {
        System.out.println("You are using MacButton");
    }
}
