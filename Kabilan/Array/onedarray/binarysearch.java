package Kabilan.Array.Onedarray;

public class binarysearch {
    public static void main(String[] args) {
        int marks[] = { 50, 60, 70, 80, 90, 100 };
        int start = 0, end = marks.length - 1;
        int key = 100;
        boolean flag = false;
        while (start <=end) {
            int mid = (start + end) / 2;
            if (marks[mid] == key) {
                System.out.println("Student got centum in atleast 1 subject!");
                flag = true;
                break;
            }
            if (key < marks[mid])
                end = mid - 1;
            else // or if (key > marks[mid])
                start = mid + 1;
        }
        if (flag == false)
            System.out.println("Student didn't get centum in any subject!");
    }
}
/*
 Output :
    Student got centum in atleast 1 subject!
 */