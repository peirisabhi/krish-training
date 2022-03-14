package factoryMethod;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/03/2022
 * Time: 9:45 am
 */
public class Iphone7Plus extends Iphone{
    @Override
    protected void createIphone() {
        features.add(new Fingerprint());
        features.add(new DualCamera());
    }
}
