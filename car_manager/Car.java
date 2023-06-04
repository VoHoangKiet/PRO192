package car_manager;

public class Car {
    private String colour;
    private int engineerPower;
    private boolean convertible, parkingBrake;

    public Car(String colour, int engineerPower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.engineerPower = engineerPower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }
    public Car() {
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEngineerPower() {
        return engineerPower;
    }

    public void setEngineerPower(int engineerPower) {
        this.engineerPower = engineerPower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }
    public void output() {
        System.out.println("Colour: "+getColour());
        System.out.println("EngineerPower: "+getEngineerPower());
        System.out.println("Convertible: "+isConvertible());
        System.out.println("ParkingBrake: "+isParkingBrake());
    }
}
