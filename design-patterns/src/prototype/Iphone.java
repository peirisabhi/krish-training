package prototype;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/03/2022
 * Time: 7:11 pm
 */
public abstract class Iphone implements Cloneable{

    private String color;
    private String storage;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
