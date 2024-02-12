package Kabilan.Array.Onedarray;

public class linearsearch {
    public static void main(String[] args) {
        int marks[] = { 50, 60, 70, 80, 90 };
        int len = marks.length;
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if (marks[i] == 100) {
                System.out.println("Student Got Centum in atleast 1 subject !");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Student didn't get centum in any of his subject!");
        }
    }
}

/*
 * Output :
 * Student didn't get centum in any of his subject!
 */