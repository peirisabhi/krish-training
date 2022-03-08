package singleton;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 08/03/2022
 * Time: 3:35 pm
 */
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton(){
        if (singleton != null){
            throw new RuntimeException("Please use getInstance method");
        }
    }

    public static Singleton getInstance() {
        if(singleton ==  null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
