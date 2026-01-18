package decorator.base;

public class normalPatty implements burger{
    public int cost()
    {
        return 30;
    }
    public void description()
    {
        System.out.println("This is veg burger");
    }
}
