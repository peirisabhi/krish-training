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

            int charValues[][] = new int[256][2];

            for(int x = 0; x< letters.length; x++){
                charValues[letters[x]][0] = letters[x];
                charValues[letters[x]][1]++;
            }

            for (int[] charVal : charValues){
                if(charVal[0] != 0) {
                    System.out.println((char) charVal[0] + " - " + charVal[1]);
                }
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
