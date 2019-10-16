public class Car extends Vehicle {
    private String top;
    private int doors;

    public String getTop() {
        return top;
    }

    public void setTop(String newTop) {
        this.top = newTop;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int newDoors) {
        this.doors = newDoors;
    }

    public int calculateMileage(int tank, int mileage) {
        int tankMiles = tank * mileage;
        return tankMiles;
    }

    public void distance() {
        System.out.println(getMake() + " " + getModel() + " with " + getDoors() + " doors and " + getTop() + " top holds " + getTank() + " gallons and gets " + getMileage() + " mpg.");
        System.out.println(getMake() + " " + getModel() + " " + getDoors() + "-doors can travel " + calculateMileage(getTank(), getMileage()) + " miles on a tank of gas.");
//        System.out.println(carMake + " " + carModel + " with " + carDoors + " doors and " + carTop + " top holds " + carTank + " gallons and gets " + carMpg + " mpg.");
//        System.out.println(carMake + " " + carModel + " " + carDoors + "-door can travel " + myCar.calculateMileage(carTank, carMpg) + " miles on a tank of gas.");

    }
/*        public void distance() {
        System.out.println("The make of your car is " + make );
        System.out.println("The model of your car is " + model);
        System.out.println(("The number of doors is " + doors));
        System.out.println("Total mileage: " + calculateMileage(tank, mileage));
    } */

    public Car (String make, String model) {
        this.make = make;
        this.model = model;
    }
}