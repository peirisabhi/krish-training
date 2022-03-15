package builder;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 15/03/2022
 * Time: 9:43 am
 */
public class Application {
    public static void main(String[] args) {

        Employee.Builder builder = new Employee.Builder("EM003");

        Employee employee = builder.gender("Male").age(23).name("Perera").build();

        System.out.println(employee);

    }
}
