import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    String name;
    int age;

    public String getFullName() {
        return (getFirstName() + " " + getLastName());
    }

    public String output(){
        return ("My full name is: " + firstName + " " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName (String fn) {
        firstName = fn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }

 /*
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
     //   System.out.println("This is a test");

    }
*/
    public static int searchList (List<User> users, String fn, String ln) {
        return searchList(users, fn + " " + ln);
    }

    public static int searchList (List<User> users, String fullName) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getFullName().equals(fullName)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        return "User [getFullName()=" + getFullName() + "]";
    }

    public User () {
        name = "Michael Han";
        age = 25;
    }
}
