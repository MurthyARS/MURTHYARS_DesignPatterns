package EPAM.TemplateDesignPattern;

import java.util.logging.Logger;

public class Car extends Vehicle{
	Logger logger = Logger.getLogger(Car.class.getName());
    public void tireCount(){
        logger.info("Car has 4 wheels");
    }

    public void passengerCount(){
        logger.info("Capacity is 4 to 7 people");
    }

    public void lifetime(){
        logger.info("Car lasts 10 years");
    }
    public static void main(String[] args) {
    	Logger logger = Logger.getLogger(Car.class.getName());
    	logger.info("Car class methods implemented");
    }
}