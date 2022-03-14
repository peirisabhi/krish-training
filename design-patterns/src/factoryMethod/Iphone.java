package factoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 13/03/2022
 * Time: 10:01 pm
 */
public abstract class Iphone {

    protected List<Features> features = new ArrayList<>();

    public Iphone (){
        createIphone();
    }

    protected abstract void createIphone();

    @Override
    public String toString() {
        return "Iphone{" +
                "features=" + features +
                '}';
    }
}
