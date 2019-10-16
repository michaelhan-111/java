public class Lab03 {
    static String concatName (String fname, String lname) {
        return (fname + " " + lname);
    }
    static String checkAge (int age){
        if (age < 18) {
            return ("You cannnot vote");
        } else {
            return ("You can vote");
        }
    }
    public static void main(String[] args) {
        System.out.println(concatName("Michael", "Han") + ": " + "Lab 03");
        System.out.println();
        int age = 0;
        if (args.length < 1) {
            System.out.println("Please submit first name, last name, and age when you run this program.");
            System.exit(0);
        } else if (args.length < 2) {
 //           if (args[0] != null) {
                System.out.println("Please submit last name and age when you run this program.");
                System.exit(0);
//            }
        } else if (args.length < 3) {
//            if (args[0] != null && args[1] != null) {
                System.out.println("Please submit age when you run this program.");
                System.exit(0);
            }
 //       }
        try {
            age = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Your age must be an integer.");
            System.exit(0);
        }
        System.out.println("Hello " + concatName(args[0], args[1]));
        System.out.println(("You are " + args[2] + " years old."));
//        age = Integer.parseInt(args[2]);
        System.out.println(checkAge(age));
//        try {
//            String y = args[1];
//
//        } catch (Exception e){
//            //System.out.println("Please submit last name and age when you run this");
//            System.out.println(e);
//            System.exit(0);
//        }
//        try {
//            int z = Integer.parseInt(args[2]);
//        } catch (Exception e){
//            System.out.println(e);
//            System.exit(0);
//        }
//        if (args.length == 1){
//            System.out.println("Please submit last name and age when you run this program.");
//            System.exit(0);
//        } else if (args.length == 2) {
//            System.out.println("Please submit your age when you run this program.");
//            System.exit(0);
//        }
    }
}