package prototype;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/03/2022
 * Time: 7:13 pm
 */
public class Iphone7Plus extends Iphone{

    private boolean fingerprint;

    public boolean isFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(boolean fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public String toString() {
        return "Iphone7Plus{" +
                "fingerprint=" + fingerprint +
                ", color=" + getColor() +
                ", storage=" + getStorage() +
                '}';
    }
}
