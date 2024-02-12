package Kabilan.Array.Onedarray;

class traversal {
    public static void main(String[] args) {
        int marks[] = { 100, 80, 90, 70, 60 };
        int length = marks.length;
        System.out.println("Students Marks:");
        for (int i = 0; i < length; i++)
            System.out.println(i + 1 + ". " + marks[i]);
    }
}

/*
  Output :
  Students Marks:
  1. 100
  2. 80
  3. 90
  4. 70
  5. 60
 */