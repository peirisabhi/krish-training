package factoryMethod;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/03/2022
 * Time: 11:33 am
 */
public class Application {
    public static void main(String[] args) {
        Iphone iphone7Plus = IphoneFactory.createIphone(IphoneModel.IPHONE_7_PLUS);
        System.out.println(iphone7Plus.toString());

        Iphone iphoneX = IphoneFactory.createIphone(IphoneModel.IPHONE_X);
        System.out.println(iphoneX);

        Iphone iphone11Pro = IphoneFactory.createIphone(IphoneModel.IPHONE_11_PRO);
        System.out.println(iphone11Pro);
    }
}
