package models;

public class PizzaMenuItem {
    private String name;
    private int price;

    @Override
    public String toString() {
        return name + " - " + price + " Kč";
    }

    public PizzaMenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        PizzaMenuItem pizzaToCompare = (PizzaMenuItem) obj;
        if(!name.equals(pizzaToCompare.getName()))
            return false;
        if(price != pizzaToCompare.getPrice())
            return false;
        return true;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
