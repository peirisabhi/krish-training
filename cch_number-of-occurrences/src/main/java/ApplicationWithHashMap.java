import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 06/03/2022
 * Time: 9:42 pm
 */
public class ApplicationWithHashMap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");

        try{
            Map<Character, Integer> occurrences = new HashMap<>();
            System.out.println(occurrences.size());

            char[] letters = scanner.next().toCharArray();

            for (char letter : letters){
                if (occurrences.size() == 0){
                    occurrences.put(letter, 1);
                }else {
                    if(occurrences.containsKey(letter)){
                        occurrences.put(letter, (occurrences.get(letter) + 1));
                    }else {
                        occurrences.put(letter, 1);
                    }
                }
            }

            for (Map.Entry<Character, Integer> occurrence : occurrences.entrySet()) {
                System.out.println(occurrence.getKey() + " - " + occurrence.getValue());
            }
            System.out.println(occurrences.size());

        }catch (Exception e){

        }

    }

}
