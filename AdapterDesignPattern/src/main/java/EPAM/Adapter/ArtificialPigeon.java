package EPAM.Adapter;

import java.util.logging.Logger;

public class ArtificialPigeon implements Pigeon { 
	Logger logger = Logger.getLogger(App.class.getName());
    public void coo() { 
        logger.info("coo roo-c'too-coo...."); 
    } 
} 