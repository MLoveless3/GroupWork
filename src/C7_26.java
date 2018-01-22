
import java.util.Scanner;

/**
 * Program to compare two sets of lists and find if they are strictly identical
 *
 * @author Abiyah Cherian
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input numbers for list1
        System.out.println("Enter List 1: ");
        int size = input.nextInt();

        int[] list1 = new int[size];
        //for loop to input numbers
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        //time to input numbers for list2
        System.out.println("Enter List 2: ");

        int size2 = input.nextInt();

        int[] list2 = new int[size2];
        //for loop to input numbers
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        //calls method to compare lists
        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }

    }

    /**
     * Equals method
     *
     * @param list1 imports list1 to compare each position
     * @param list2 imports list2 to compare each position
     * @return whether the lists are completely identical or not
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;

    }
}
