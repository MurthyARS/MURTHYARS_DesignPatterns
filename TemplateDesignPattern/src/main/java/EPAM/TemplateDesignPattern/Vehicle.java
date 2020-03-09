package EPAM.TemplateDesignPattern;

public abstract class Vehicle {
    public abstract void tireCount();
    public abstract void passengerCount();
    public abstract void lifetime();
    public void doEveryday(){
        tireCount();
        passengerCount();
        lifetime();
    }
}