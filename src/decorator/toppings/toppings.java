package decorator.toppings;

import decorator.base.burger;

public abstract class toppings implements burger {
    burger burger;
    public toppings(burger burger)
    {
        this.burger=burger;
    }





}
