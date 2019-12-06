import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab08 {
    public static void main (String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        System.out.println("Michael Han: Lab 8");
        System.out.println();
        System.out.println("How many students do you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter name " + (i+1) + ":");
            String name = scanner.nextLine().trim();
            students.add(name);
        }
        System.out.println("Here are your students: ");
        for (int j = 0; j < students.size(); j++) {
            System.out.println(students.get(j));
        }
        System.out.println();
        System.out.println("How many scores do you want to enter: ");
        int tellScores = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        int placeholder = 0;
        int counter = 0;
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter scores for " + students.get(placeholder));
            while (counter < tellScores) {
                System.out.println("Enter score " + (counter + 1) + ":");
                int grade = scanner.nextInt();
                scores.add(grade);
                counter++;
            }
            placeholder++;
            System.out.println("Removing the lowest and highest score ...");
            Collections.sort(scores);
            System.out.println("Here are your scores for " + students.get(i));
            scores.remove(0);
            scores.remove((tellScores-2));
            Collections.reverse(scores);
            for (int updatedScores : scores){
                System.out.println(updatedScores);
            }
            System.out.println();
            scores.clear();
            counter=0;
        }


 /*
        System.out.println("How many scores do you want to enter: ");
        int tellScores = scanner.nextInt();
        System.out.println();
        System.out.println("Enter scores for " + students.get(0));
        for (int k = 0; k < tellScores; k++) {
            System.out.println("Enter score " + (k+1) + ":");
            int tellGrade = scanner.nextInt();
            scores.add(tellGrade);
        }
        System.out.println("Removing the lowest and highest score ...");
        Collections.sort(scores);
        System.out.println("Here are your scores for " + students.get(0));
        scores.remove(0);
        scores.remove((tellScores-2));
        Collections.reverse(scores);
        for (int updatedScores : scores){
            System.out.println(updatedScores);
        }
        System.out.println();
        scores.clear();
        System.out.println("Enter scores for " + students.get(1));
        for (int j = 0; j < tellScores; j++) {
            System.out.println("Enter score " + (j+1) + ":");
            int tellGrade = scanner.nextInt();
            scores.add(tellGrade);
        }
        System.out.println("Removing the lowest and highest score ...");
        Collections.sort(scores);
        System.out.println("Here are your scores for " + students.get(1));
        scores.remove(0);
        scores.remove((tellScores-2));
        Collections.reverse(scores);
        for (int updatedScores : scores){
            System.out.println(updatedScores);
        }

  */
    }
}
