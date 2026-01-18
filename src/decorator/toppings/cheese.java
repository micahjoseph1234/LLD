package decorator.toppings;

import decorator.base.burger;

public class cheese extends toppings{
   public cheese(burger burger)
    {
        super(burger);
    }

    @Override
    public int cost()
    {
        return burger.cost()+10;
    }
    @Override
    public void description()
    {
        System.out.println("cheese toppings");
    }

}
