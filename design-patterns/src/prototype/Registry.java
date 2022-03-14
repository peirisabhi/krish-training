package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/03/2022
 * Time: 7:26 pm
 */
public class Registry {

    private Map<IphoneModel, Iphone> iPhones = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public Iphone getIphone(IphoneModel iphoneModel) {

        Iphone iphone = null;
        try {
            iphone = (Iphone) iPhones.get(iphoneModel).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return iphone;

    }

    private void initialize() {

        Iphone7Plus iphone7Plus = new Iphone7Plus();
        iphone7Plus.setFingerprint(true);
        iphone7Plus.setColor("Jet Black");
        iphone7Plus.setStorage("128Gb");

        IphoneX iphoneX = new IphoneX();
        iphoneX.setColor("Red");
        iphoneX.setStorage("64Gb");
        iphoneX.setFaceUnlock(true);

        iPhones.put(IphoneModel.IPHONE_7_PLUS, iphone7Plus);
        iPhones.put(IphoneModel.IPHONE_X, iphoneX);

    }

}
