public enum PizzaTopping
{
    PEPPORONI("Pepporoni"),
    PEPPERS("Peppers"),
    HAM("Ham"),
    SAUSAGE("Sausage"),
    CHICKEN("Chicken"),
    PESTO("Pesto"),
    MUSHROOMS("Mushrooms"),
    OLIVES("Olives"),
    SPICY_PORK("Spicy Pork"),
    BACON("Bacon"),
    SPINACH("Spinach"),
    HAM_PINE("Ham and Pinapple"),
    ONIONS("Onions"),
    TOMATO_BASIL("Tomato and Basil"),
    EXTRA_CHEESE("Extra Cheese"),
    BEEF("Beef");

    private String toppingName;

    PizzaTopping(String topping_name) {
        toppingName = topping_name;
    }

    String GetPizzaTopping() {
        return toppingName;
    }
};
