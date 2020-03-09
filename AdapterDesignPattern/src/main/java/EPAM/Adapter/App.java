package EPAM.Adapter;

import java.util.logging.Logger;

public class App { 
	public static void main(String args[])  { 
		Logger logger = Logger.getLogger(App.class.getName());
		Parrot parrot = new Parrot(); 
		Pigeon pigeon = new ArtificialPigeon(); 
		Pigeon birdsounds = new BirdSounds(parrot); 
		logger.info("Parrot class\n"); 
		parrot.whichFly(); 
		parrot.whichMakeSound(); 
		logger.info("Pigeon class"); 
		pigeon.coo(); 
		logger.info("BirdSounds class"); 
		birdsounds.coo(); 
	} 
}