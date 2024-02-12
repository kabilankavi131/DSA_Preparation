package Kabilan.Array.Onedarray;

class searching {
    public static void main(String[] args) {
        int marks[] = { 100, 90, 80, 60, 70 };
        int length = marks.length;
        int failmark = 50;
        boolean pass = true;
        for (int i = 0; i < length; i++) {
            if (marks[i] < failmark)
                pass = false;
        }
        if (pass)
            System.out.println("Student got passed in all subjects");
        else
            System.out.println("Student didn't get passed in all subjects");
    }
}
/*Output :
 Student got passed in all subjects
 */