package abstractFactory;

public class WindowsCheckBox implements AppCheckBox{
    @Override
    public void paint()
    {
        System.out.println("You are using Windows button");
    }
}
