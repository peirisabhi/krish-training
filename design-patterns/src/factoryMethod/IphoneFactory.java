package factoryMethod;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/03/2022
 * Time: 9:51 am
 */
public class IphoneFactory {

    public static Iphone createIphone(IphoneModel iphoneModel){

        switch (iphoneModel){
            case IPHONE_7_PLUS:
                return new Iphone7Plus();

            case IPHONE_X:
                return new IphoneX();

            case IPHONE_11_PRO:
                return new Iphone11Pro();

            default:
                return null;
        }

    }

}
