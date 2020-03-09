package EPAM.Adapter;

import java.util.logging.Logger;

public class Parrot implements Birds { 
	Logger logger = Logger.getLogger(App.class.getName());
    public void whichFly()   { 
        logger.info("Flying Parrot"); 
    } 
    public void whichMakeSound()  { 
        logger.info("screech...screech..."); 
    } 
} 