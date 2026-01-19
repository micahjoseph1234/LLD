package abstractFactory;

public class WindowsButton implements AppButton{
    @Override
    public void paint()
    {
        System.out.println("You are using windows button");
    }
}
