package prototype;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/03/2022
 * Time: 7:32 pm
 */
public class Application {

    public static void main(String[] args) {

        Registry registry = new Registry();

        Iphone7Plus iphone7Plus = (Iphone7Plus) registry.getIphone(IphoneModel.IPHONE_7_PLUS);
        System.out.println(iphone7Plus);

        iphone7Plus.setStorage("256Gb");
        System.out.println(iphone7Plus);

        Iphone7Plus iphone7Plus1 = (Iphone7Plus) registry.getIphone(IphoneModel.IPHONE_7_PLUS);
        System.out.println(iphone7Plus1);

    }

}
