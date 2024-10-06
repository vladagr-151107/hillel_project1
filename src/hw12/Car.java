package hw12;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("The car is turned!");
    }
    private void startElectricity() {
        System.out.println("Start the electricity.");
    }

    private void startCommand() {
        System.out.println("Start the command.");
    }

    private void startFuelSystem() {
        System.out.println("Start the fuel system.");
    }
}
