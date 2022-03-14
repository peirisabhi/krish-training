package factoryMethod;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/03/2022
 * Time: 9:47 am
 */
public class IphoneX extends Iphone{
    @Override
    protected void createIphone() {
        features.add(new DualCamera());
        features.add(new FaceRecognition());
    }
}
