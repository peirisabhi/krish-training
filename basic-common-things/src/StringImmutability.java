/**
 * Created by Intellij.
 * Author: abhis
 * Date: 10/04/2022
 * Time: 3:02 pm
 */
public class StringImmutability {

    public static void main(String[] args) {

        String name = "ABC";
        String name1 = new String("ABC");  // create a new string object
        String name2 = "ABC";

        System.out.println(name == name1);  // false
        System.out.println(name == name2);  // true

        name2 = "DEF";  // automatically creat new object and set value as DEF and assign to the name2

        System.out.println(name2);

        String concat = name.concat("DEF");// in this stage create new object automatically and put value as ABCDEF and return
        System.out.println(name);  // ABC (because name value still not changed)
        System.out.println(concat); //ABCDEF

    }

}
