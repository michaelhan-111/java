import java.util.Scanner;

public class Lab06 {
    public static void main (String[] args) {
        System.out.println("Michael Han : Midterm 1");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        Student[] students = {new Student("123"), new Student("234")};
        int numOfStudents = students.length;
        for (int i=0; i<numOfStudents; i++) {
            System.out.println("Enter Student " + students[i].getId() + " first name: ");
            students[i].setFirstName(scanner.nextLine());
            System.out.println("Enter Student " + students[i].getId() + " last name: ");
            students[i].setLastName(scanner.nextLine());
            System.out.println("Enter Student " + students[i].getId() + " year: ");
            students[i].setSchoolYear(scanner.nextLine());
//            scanner.nextLine();
            System.out.println("Enter Student " + students[i].getId() + " major: ");
            students[i].setMajor(scanner.nextLine());
            System.out.println();
        }
        for (int i=0; i<numOfStudents; i++) {
//            System.out.println();
            System.out.println("Student " + students[i].getId() + ":");
//            students[i].display(students[i].getSchoolYear(), students[i].getMajor());
            students[i].display();
        }
    }
}
