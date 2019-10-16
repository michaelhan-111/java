import java.util.Scanner;

public class Lab05 {
    public static void main (String[] args) {
        String carMake;
        String carModel;
        String truckMake;
        String truckModel;
        int carTank;
        int carMpg;
        String carTop;
        int carDoors;
        int truckTank;
        int truckMpg;
        int truckTon;

        System.out.println("Student Name: Michael Han");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter car make: ");
        carMake = scanner.nextLine();
        System.out.println("Enter car model: ");
        carModel = scanner.nextLine();
        Car myCar = new Car(carMake, carModel);
        System.out.println("Enter truck make: ");
        truckMake = scanner.nextLine();
        System.out.println(("Enter truck model: "));
        truckModel = scanner.nextLine();
        Truck myTruck = new Truck(truckMake, truckModel);
        System.out.println();
        System.out.println("How many gallons does your the " + carModel + " gas tank hold?");
//        System.out.println("How many gallons does your the " + carModel + " gas tank hold and what's the mpg?");
        carTank = scanner.nextInt();
        myCar.setTank(carTank);
        System.out.println("What is the " + carModel + " mpg?");
        carMpg = scanner.nextInt();
        myCar.setMileage(carMpg);
//        scanner.nextLine();
//        System.out.println("Temp is: " + temp);
//        System.out.println();
        System.out.println("What kind of top does the " + carModel + " have?");
        carTop = scanner.nextLine();
        myCar.setTop(carTop);
        System.out.println("How many doors does the " + carModel + " have?");
        carDoors = scanner.nextInt();
        myCar.setDoors(carDoors);
        System.out.println("How many gallons does the " + truckModel + " gas tank hold?");
        truckTank = scanner.nextInt();
        myTruck.setTank(truckTank);
        System.out.println("What is the " + truckModel + " mpg?");
        truckMpg = scanner.nextInt();
        myTruck.setMileage(truckMpg);
        System.out.println("What tonnage can the " + truckModel + " carry?");
        truckTon = scanner.nextInt();
        myTruck.setTons(truckTon);
        System.out.println();
        myCar.distance();
        myTruck.distance();
//        System.out.println(carMake + " " + carModel + " with " + carDoors + " doors and " + carTop + " top holds " + carTank + " gallons and gets " + carMpg + " mpg.");
//        System.out.println(carMake + " " + carModel + " " + carDoors + "-door can travel " + myCar.calculateMileage(carTank, carMpg) + " miles on a tank of gas.");
//        System.out.println(truckMake + " " + truckModel + " holds " + truckTank + " gallons and gets " + truckMpg + " mpg, and can carry " + truckTon + " tons.");
//        System.out.println(truckMake + " " + truckModel + " can travel " + myTruck.calculateMileage(truckTank, truckMpg) + " miles on a tank of gas when fully loaded with cargo.");
    }
}
