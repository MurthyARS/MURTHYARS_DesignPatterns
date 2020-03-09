package EPAM.TemplateDesignPattern;

import java.util.logging.Logger;

public class Bus extends Vehicle{
	Logger logger = Logger.getLogger(Car.class.getName());
    public void tireCount(){
        logger.info("Bus has 6 wheels");
    }

    public void passengerCount(){
        logger.info("Capacity is 25 to 50 people");
    }

    public void lifetime(){
        logger.info("Bus lasts 7 years");
    }
    public static void main(String[] args) {
    	Logger logger = Logger.getLogger(Car.class.getName());
    	logger.info("Bus class methods implemented");
    }
}
