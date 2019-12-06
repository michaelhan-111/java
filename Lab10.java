import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Lab10 {
    interface Major {
     public String getMajor();
     public void setMajor(String major);
    }

    interface Deposit {
    public int getDeposit();
    public void setDeposit(int deposit);
    }

     static class Student implements Major, Deposit{
        private String major;
        private int deposit;

        public Student() {
        }
        public Student(String major, int deposit) {
             this.major = major;
             this.deposit = deposit;
         }
        public void setMajor(String major){
            this.major = major;
        }
        public String getMajor(){
            return major;
        }
        public void setDeposit(int deposit){
            this.deposit = deposit;
        }
        public int getDeposit(){
            return deposit;
        }
        enum Toner {
            CYAN,
            MAGENTO,
            YELLOW,
            BLACK
        }
    }

    public static void main (String[] args) {
        Student myStudent = new Student("Music", 25);
        Student myStudent2 = new Student();
        myStudent2.setMajor("Math");
        myStudent2.setDeposit(50);
        System.out.println("Michael Han : Lab 10");
        System.out.println();
        System.out.println("Student 1 major: " + myStudent.getMajor());
        System.out.println("Student 1 deposit: " + myStudent.getDeposit());
        System.out.println("Student 2 major: " + myStudent2.getMajor());
        System.out.println("Student 2 deposit: " + myStudent2.getDeposit());
        System.out.println();
        System.out.println("Toner:");
        for (Student.Toner myToner : Student.Toner.values()) {
            System.out.println(myToner);
        }
        System.out.println();
        ArrayList<String> colleges = new ArrayList<>();
        System.out.println("Arraylist:");
        System.out.println("How many college names do you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int numOfColleges = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<numOfColleges; i++){
            System.out.println("Enter a college name: ");
            colleges.add(scanner.nextLine());
        }
        System.out.println();
        System.out.println("Here are your colleges: ");
        for( String university : colleges) {
            System.out.println(university);
        }
        System.out.println();
        System.out.println("Hashmap:");
        System.out.println("How many departments do you want to enter?");
        int numOfDepts = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, String> collegeInfo = new HashMap<String, String>();
        for (int i=0; i<numOfDepts; i++){
            System.out.println("Enter the department name:");
            String dept = scanner.nextLine();
            System.out.println("Enter the name of the department chair:");
            collegeInfo.put(dept, scanner.nextLine());
        }
        System.out.println();
        System.out.println("Here are your department chairs:");
        for (String key : collegeInfo.keySet()){
            System.out.println(key + " chair is " + collegeInfo.get(key));
        }
    }
}
