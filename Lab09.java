import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Lab09 {
    public static void main (String[] args) {
        HashMap<String, Integer> studentInfo = new HashMap<String, Integer>();
        System.out.println("Michael Han : Lab 9");
        System.out.println();
        System.out.println("How many students do you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        scanner.nextLine();
        System.out.println("How many scores do you want to enter for each student?");
        int numOfScores = scanner.nextInt();
        scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter student number " + (i+1) + " name: ");
            String studentName = scanner.nextLine();
            while (counter < numOfScores) {
                System.out.println("Enter score " + (counter + 1) + " for " + studentName + ":");
                studentInfo.put((studentName + " score " + (counter + 1)), scanner.nextInt());
                scanner.nextLine();
                counter++;
            }
            counter=0;
        }
        Map<String, Integer> sorted = new TreeMap<String, Integer>(studentInfo);
        for (String key : sorted.keySet()){
            System.out.println("key: " + key + ", value: " + sorted.get(key));
        }
    }
}
