package example2;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 01/04/2022
 * Time: 6:43 pm
 */
public class Application {
    public static void main(String[] args) {
        int val = new Table().calculate(10);
        System.out.println(val);
    }
}

class Table implements Square{

    @Override
    public int calculate(int width) {
        return width * width;
    }
}
