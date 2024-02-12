package Kabilan.Array.Onedarray;

import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int size;
        System.out.println("Enter the array size: ");
        size = scanf.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Value " + (i + 1));
            array[i] = scanf.nextInt();
        }
        System.out.println("Entered Values :");
        for (int i = 0; i < size; i++)
            System.out.println("Value " + (i + 1) + " = " + array[i]);

        scanf.close();
    }
}
/* Output : 
    Enter the array size: 
    4
    Enter Value 1
    8
    Enter Value 2
    5
    Enter Value 3
    3
    Enter Value 4
    2
    Entered Values :
    Value 1 = 8
    Value 2 = 5
    Value 3 = 3
    Value 4 = 2
 */
