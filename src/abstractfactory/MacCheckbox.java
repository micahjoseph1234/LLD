package abstractFactory;

public class MacCheckbox implements AppCheckBox{
    @Override
    public void paint()
    {
        System.out.println("You are using mac checkbox");
    }
}
