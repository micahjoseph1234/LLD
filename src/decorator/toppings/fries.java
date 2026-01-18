package decorator.toppings;

import decorator.base.burger;

public class fries extends toppings{
    public fries(burger burger)
    {
        super(burger);
    }
    @Override
    public int cost()
    {
        return burger.cost()+30;
    }
    @Override
    public void description()
    {
        burger.description();

        System.out.println("+fries toppings");
    }

}
