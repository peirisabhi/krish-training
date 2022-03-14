package factoryMethod;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/03/2022
 * Time: 9:48 am
 */
public class Iphone11Pro extends Iphone{
    @Override
    protected void createIphone() {
        features.add(new ESim());
        features.add(new FaceRecognition());
        features.add(new WideCamera());
        features.add(new WirelessCharging());
    }
}
