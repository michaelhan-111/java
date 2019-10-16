import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Testing {
    public static void main (String [] args){

        String[] firstNames = {"Michael", "Paul", "Aram", "Jack"};
        String[] lastNames = {"Han", "Kackert", "Martirosyan", "Jill"};
        List<User> users = new ArrayList<User>();
        //User testing = new User();

//        for (int i = 0; i < firstNames.length; i++) {
            User u = new User();
//            u.setFirstName(firstNames[i]);;
//            u.setLastName(lastNames[i]);
//            users.add(u);
            u.setFirstName("Michael");
            u.setLastName("Han");
            users.add(u);
//        }
//        for (User u : users) {
            System.out.println(u);
            System.out.println("My name is " + u.name + " and I'm " + u.age + " years old!");
//        }
//        System.out.println(User.searchList(users, "Michael" , "Han"));

    }
}


/*
        List<Integer> grades = new ArrayList<Integer>();

        grades.add(5);
        grades.add(10);
        grades.add(1,7);
//       grades.clear();
            if (grades.isEmpty()) {
                System.out.println("Grades array is empty bro!");
            } else {
                for(int i = 0; i < grades.size(); i++) {
                    System.out.println("Index " + i + ": " + grades.get(i));
                }
            }


            for (int i = 9; i >= 0; i--) {
            //System.out.println(i + " ");
            for (int k = i; k >= 0; k--){
                if (k==5){
                    continue;
                }
                System.out.print(k + " ");
            }
            System.out.println();
        }

                int[][] grades = {
                {5,6,9},
                {6,76,43,54},
                {7,2,4},
                {6,1,3}
        };

        //Scanner input = new Scanner(System.in);

        for (int row = 0; row < grades.length; row++) {
            for (int col = 0; col < grades[row].length; col++) {
                System.out.print(grades[row][col] + " ");
            }
            System.out.println();
        }
        //        Arrays.sort(grades);
//        System.out.println(Arrays.toString(grades));
//        input.close();
*/