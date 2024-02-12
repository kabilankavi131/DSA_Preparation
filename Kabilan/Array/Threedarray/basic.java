package Kabilan.Array.Threedarray;

public class basic {
    public static void main(String[] args) {
        int data[][][] = { {
                { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }
        }, {
                { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }
        } };
        for (int arrray = 0; arrray < 2; arrray++) {
            if (arrray == 0)
                System.out.println("First Array Elements : ");
            else
                System.out.println("Second Array Elements : ");
            for (int row = 0; row < 2; row++) {
                for (int col = 0; col < 5; col++) {
                    System.out.print(data[arrray][row][col] + " ");
                }
                System.out.println();
            }
        }
    }
}
