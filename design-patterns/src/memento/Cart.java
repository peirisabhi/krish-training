package memento;

import java.util.ArrayList;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 15/03/2022
 * Time: 6:41 pm
 */
public class Cart {

    ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return (ArrayList<Item>) items.clone();
    }

    public CartMemento save(){
        return new CartMemento(getItems());
    }

    public void revert(CartMemento cartMemento){
        items = cartMemento.getItems();
    }

    static class CartMemento{
        ArrayList<Item> items;

        public CartMemento(ArrayList<Item> items) {
            this.items = items;
        }

        public ArrayList<Item> getItems() {
            return items;
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }

}
