package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private List<PizzaMenuItem> menuItems;
    private LocalDateTime lastUpdate;

    public PizzaMenu(){
        menuItems = new ArrayList<>();
        setLastUpdate();
    }
    public void addItem(PizzaMenuItem toAdd){
        menuItems.add(toAdd);
        setLastUpdate();
    }
    public void removeItem(PizzaMenuItem toRemove){
        menuItems.remove(toRemove);
        setLastUpdate();
    }
    public List<PizzaMenuItem> getMenuItems() {
        return menuItems;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    private void setLastUpdate(){
        lastUpdate = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object obj) {
        PizzaMenu menuToCompare = (PizzaMenu) obj;
        if(menuItems.size() != menuToCompare.getMenuItems().size())
            return false;

        for (int i = 0; i < menuItems.size(); i++) {
            PizzaMenuItem pizzaFromCurrentMenu = menuItems.get(i);
            PizzaMenuItem pizzaFromOtherMenu = menuToCompare.getMenuItems().get(i);

            if(!pizzaFromCurrentMenu.equals(pizzaFromOtherMenu))
                return false;
        }

        return true;
    }
}
