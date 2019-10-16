abstract class Vehicle {
    protected String make;
    protected String model;
    protected int mileage;
    protected int tank;

    public String getMake() {
        return make;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int newMileage) {
        this.mileage = newMileage;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int newTank) {
        this.tank = newTank;
    }

    public int calculateMileage(int tank, int mileage) {
        int tankMiles = tank * mileage;
        return tankMiles;
    }
}