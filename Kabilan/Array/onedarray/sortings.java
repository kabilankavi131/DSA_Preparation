package Kabilan.Array.onedarray;

public class sortings {

    static int[] bubblesort(int[] marks, int len) {
        int flag = 1;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    flag = 0;
                }
            }
            if (flag == 1)
                break;
        }
        return marks;
    }

    public static void main(String[] args) {
        int marks[] = { 100, 60, 90, 70, 80 };
        int len = marks.length;
        System.out.println("Before Sorting..");
        for (int i : marks)
            System.out.print(i + " ");
        System.out.println();
        marks = bubblesort(marks, len);
        System.out.println("After Sorting..");
        for (int i : marks) {
            System.out.print(i + " ");
        }
    }
}
/*
 * Before Sorting..
 * 100 60 90 70 80
 * After Sorting..
 * 60 70 80 90 100
 */