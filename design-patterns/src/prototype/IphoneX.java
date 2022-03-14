package prototype;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 14/03/2022
 * Time: 7:14 pm
 */
public class IphoneX extends Iphone{

   private boolean faceUnlock;

    public boolean isFaceUnlock() {
        return faceUnlock;
    }

    public void setFaceUnlock(boolean faceUnlock) {
        this.faceUnlock = faceUnlock;
    }

    @Override
    public String toString() {
        return "IphoneX{" +
                "faceUnlock=" + faceUnlock +
                ", color=" + getColor() +
                ", storage=" + getStorage() +
                '}';
    }
}
