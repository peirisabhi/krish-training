import java.util.Scanner;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 06/03/2022
 * Time: 8:43 pm
 */
public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");

        try{

            char[] letters = scanner.next().toLowerCase().toCharArray();

            int charValues[][] = new int[256][1];

            for(int x = 0; x< letters.length; x++){
                System.out.println(letters[x]);
                charValues[letters[x]][0]++;
            }

            for (int[] charVal : charValues){
                System.out.println(charVal.length + " - " );
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
