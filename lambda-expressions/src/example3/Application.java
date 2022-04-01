package example3;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 01/04/2022
 * Time: 9:30 pm
 */
public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Consumer<Integer> method = (number) -> {  // we can store lambda expression as a Consumer type variable. 
            System.out.println(number);
        };

        numbers.forEach(method);

    }
}
