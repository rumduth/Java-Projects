
class CoffeeMachine {
    private float coffeeQty;
    private float waterQty;

    static private CoffeeMachine our = null;

    private CoffeeMachine() {
        coffeeQty = 1000;
        waterQty = 1000;
    }

    static public CoffeeMachine getInstance() {
        if (our == null)
            our = new CoffeeMachine();
        return our;
    }
}

public class Singleton {

}
