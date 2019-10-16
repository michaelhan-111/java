public class Truck  extends Vehicle {
    private int tons;

    public int getTons () {
        return tons;
    }

    public void setTons(int newTons) {
        this.tons = newTons;
    }

    public void distance() {
        System.out.println(getMake() + " " +  getModel() + " holds " + getTank() + " gallons and gets " + getMileage() + " mpg, and can carry " + getTons() + " tons.");
        System.out.println(getMake() + " " + getModel() + " can travel " + calculateMileage(getTank(), getMileage()) + " miles on a tank of gas when fully loaded with cargo.");
        //      System.out.println(truckMake + " " + truckModel + " holds " + truckTank + " gallons and gets " + truckMpg + " mpg, and can carry " + truckTon + " tons.");
        //      System.out.println(truckMake + " " + truckModel + " can travel " + myTruck.calculateMileage(truckTank, truckMpg) + " miles on a tank of gas when fully loaded with cargo.");
    }

    public Truck (String make, String model) {
        this.make = make;
        this.model = model;
    }
    public int calculateMileage(int tank, int mileage) {
        int tankMiles = (tank * mileage)/2;
        return tankMiles;
    }
}
