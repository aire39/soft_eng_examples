import java.util.Vector;

class Pizza implements Cloneable {
    private String storeName;
    private Vector<PizzaTopping> toppings;
    private PizzaSize size;

    Pizza() {
        toppings = new Vector<>();
        storeName = "Unnamed Store";
    }

    Pizza(String store_name, Vector<PizzaTopping> toppings, PizzaSize size) {
        storeName = store_name;
        this.toppings = toppings;
        this.size = size;
    }
    
    public void AddTopping(PizzaTopping topping) {
        toppings.add(topping);
    }

    public void SetSize(PizzaSize size) {
        this.size = size;
    }

    public void SetPizzaStore(String store_name) {
        storeName = store_name;
    }

    public void eat() {
        System.out.print ("Ate " + size + " ");
        for (PizzaTopping topping : toppings)
        {
            System.out.print(topping + ", ");
        }
    
        if (!storeName.isEmpty())
        {
            System.out.println("from " + storeName);
        }
        else
        {
            System.out.println("");
        } 
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pizza pizza = (Pizza)super.clone();
        pizza.toppings = new Vector<>();
        
        for (PizzaTopping topping : toppings) {
            pizza.toppings.add(topping);
        }

        return pizza;
    }
};
