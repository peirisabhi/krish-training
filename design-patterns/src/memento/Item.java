package memento;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 15/03/2022
 * Time: 6:41 pm
 */
public class Item {

    String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
