import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab07 {
    interface Major {
         enum Majors {
            ART,
            HISTORY,
            MATH,
            MUSIC
        }
        public void setMajor(String input);
        public String getMajor();
        public boolean requestMajor();
    }

    public interface Payment {
        public void setDeposit(int something);
        public int getDeposit();
    }
     static class Student implements Major, Payment {
         Scanner scanner = new Scanner(System.in);
         private String major;
         private int deposit;

         public void setMajor(String major) {
             this.major = major;
         }

         public String getMajor() {
             return major;
         }

         public void setDeposit(int deposit) {
             this.deposit = deposit;
         }
         public int getDeposit() {
             return deposit;
         }

         public boolean requestMajor() {
             System.out.println("Available Majors are: ");
             for (Majors myMajors : Majors.values()) {
                 System.out.println(myMajors);
             }
             System.out.println("Please enter a major: ");
             major = scanner.nextLine().trim();
             major = major.toUpperCase();
//             System.out.println();
             for (Majors myMajors : Majors.values()) {
                     if (myMajors.toString().equals(major)) {
                         return true;
                     }
                 }
             System.out.println(major + " is not an available major.");
             System.out.println();
             return false;
         }
     }
    public static void main (String[] args) {
        Student myStudent = new Student();
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formattedDateTime = DateTimeFormatter.ofPattern("dd-MMM-yyyy h:mm a");
        String formattedDateTimeTime = currentDateTime.format(formattedDateTime);
        int i = 0;
        while (i < 3) {
            i++;
            if (myStudent.requestMajor()){
                myStudent.setDeposit(50);
                System.out.println("Your major is: " + myStudent.getMajor());
                System.out.println("Your deposit is: $" + myStudent.getDeposit());
                System.out.println("Today is: " + formattedDateTimeTime);
                break;
            } else if (i == 3) {
                System.out.println("Please try again later.");
            }
        }
    }
}
