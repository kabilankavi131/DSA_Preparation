package Kabilan.Array.Onedarray;

public class sortings {
    static int[] bubbleSort(int[] marks, int len) {
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

    static int[] selectionSort(int[] marks, int len) {
        for (int i = 0; i < len - 1; i++) {
            int min = i; // Assume the first value as minimum value
            for (int j = i + 1; j < len; j++) {
                if (marks[j] < marks[min])
                    min = j;
            }
            if (min != i) { // To check whether the minimum value is not the initial value which we
                            // assumed,if it is then we don't have to swap them anymore bcoz it just take
                            // some extra time!!
                int temp = marks[i];
                marks[i] = marks[min];
                marks[min] = temp;
            }
        }
        return marks;
    }

    static int[] insertionSort(int[] marks, int len) {
        for (int i = 1; i < len; i++) {
            int temp = marks[i];
            int j = i - 1;
            while (j >= 0 && marks[j] > temp) {
                marks[j + 1] = marks[j]; // here the value is actually over writted!! so don't get confused
                j--;
            }
            marks[j + 1] = temp;
        }
        return marks;
    }

    public static void main(String[] args) {
        int marks[] = { 100, 60, 90, 70, 80 };
        int len = marks.length;
        System.out.println("Bubble Sorting..");
        System.out.println("Before Sorting..");
        for (int i : marks)
            System.out.print(i + " ");
        System.out.println();
        marks = bubbleSort(marks, len);
        System.out.println("After Sorting..");
        for (int i : marks) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Insertion Sorting..");
        System.out.println("Before Sorting..");
        for (int i : marks)
            System.out.print(i + " ");
        System.out.println();
        marks = insertionSort(marks, len);
        System.out.println("After Sorting..");
        for (int i : marks) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Selection Sorting..");
        System.out.println("Before Sorting..");
        for (int i : marks)
            System.out.print(i + " ");
        System.out.println();
        marks = selectionSort(marks, len);
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

/*
 * Time Complexity :
 * Bubble Sort:
 * 
 * Best Case: O(n) - When the array is already sorted.
 * Worst Case: O(n^2) - When the array is in reverse order.
 * 
 * Selection Sort:
 * 
 * Best Case: O(n^2) - Same as the worst case.
 * Worst Case: O(n^2) - No matter the initial order of the array.
 * 
 * Insertion Sort:
 * 
 * Best Case: O(n) - When the array is almost sorted.
 * Worst Case: O(n^2) - When the array is in reverse order.
 */