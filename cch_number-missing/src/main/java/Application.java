import java.util.Scanner;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 06/03/2022
 * Time: 8:43 am
 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number pattern (EX: 1,2,3,4)");

        try {
            int missingNumber = 0;
            int missingNumberCount = 0;

            String[] numbers = scanner.next().split(",");

            if (numbers.length == 0) {
                System.out.println("Invalid pattern!");

            } else {
                int min = 0;
                int max = 0;
                for (String number : numbers) {
                    int numberVal = Integer.parseInt(number);

                    if (min == 0) {
                        min = numberVal;
                    } else if (min > numberVal) {
                        min = numberVal;
                    }

                    if (numberVal > max) {
                        max = numberVal;
                    }
                }


                for (int i = min; max >= i; i++) {
                    boolean numberFound = false;
                    for (String number : numbers) {
                        int numberVal = Integer.parseInt(number);
                        if (numberVal == i) {
                            numberFound = true;
                            break;
                        }
                    }
                    if (!numberFound) {
                        missingNumberCount++;
                        missingNumber = i;
                        if (missingNumberCount > 1)
                            break;
                    }
                }


                switch (missingNumberCount) {
                    case 0:
                        System.out.println("No missing numbers in this pattern, but first or last number will be missing.");
                        System.out.println("If we think first number missing, missing number is " + (min - 1));
                        System.out.println("If we think last number missing, missing number is " + (max + 1));
                        break;
                    case 1:
                        System.out.println("Missing number is " + missingNumber);
                        break;
                    case 2:
                        System.out.println("Number missing count more than one.");
                        break;
                }

            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid pattern with invalid number, " + e.getLocalizedMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
