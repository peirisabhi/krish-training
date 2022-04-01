package example2;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 01/04/2022
 * Time: 7:47 pm
 */
public class LambdaApplication {
    public static void main(String[] args) {
        Square square = width -> width*width;  // only can use single method interfaces

        System.out.println(square.calculate(10));
    }
}
