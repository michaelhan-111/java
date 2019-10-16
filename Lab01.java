import java.util.Scanner;

public class Lab01 {
    public static void main (String [] args){
        System.out.println("Michael Han: Lab1");
        System.out.println();
        int nbr1;
        int nbr2;
        int sum;
        String even = "The sum is even";
        String odd = "The sum is odd";
        nbr1 = 5;
        nbr2 = 7;
        sum = nbr1 + nbr2;
        System.out.println("nbr1 = " + nbr1);
        System.out.println("nbr2 = " + nbr2);
        System.out.println("sum = " + sum);
        if (sum % 2 == 0) {
            System.out.println(even);
        } else {
            System.out.println(odd);
        }
        System.out.println();

        nbr1 = 8;
        sum = nbr1 + nbr2;
        System.out.println("nbr1 = " + nbr1);
        System.out.println("nbr2 = " + nbr2);
        System.out.println("sum = " + sum);
        if (sum % 2 == 0) {
            System.out.println(even);
        } else {
            System.out.println(odd);
        }
    }
}

/*
        System.out.println("Give me a number to find out whether it's odd or even:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }
 */