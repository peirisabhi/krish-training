package singleton;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 08/03/2022
 * Time: 3:53 pm
 */
public class Test {

    public static void main(String[] args) {

        long start;
        long end;

        start = System.currentTimeMillis();
        Singleton singleton1 = Singleton.getInstance();
        end = System.currentTimeMillis();
        System.out.println(singleton1);
        System.out.println("singleton1 instance creation time -- " + (end - start));

        start = System.currentTimeMillis();
        Singleton singleton2 = Singleton.getInstance();
        end = System.currentTimeMillis();
        System.out.println(singleton2);
        System.out.println("singleton2 instance creation time -- " + (end - start));
    }
}
