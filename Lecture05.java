import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Lecture05 {
    public static void main(String[] args) {
//        LC lc = new LC();
//        lc.show();
        //System.out.println((lc.brand));

        String name;
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("My name is " + name + " and my age is " + age);
    }
}
