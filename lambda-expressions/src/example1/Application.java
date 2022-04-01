package example1;

import java.util.ArrayList;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 01/04/2022
 * Time: 6:16 pm
 */
public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for(Integer number : numbers){
            System.out.println(number);
        }

        numbers.forEach((number) -> {
            System.out.println(number);
        });

    }
}
