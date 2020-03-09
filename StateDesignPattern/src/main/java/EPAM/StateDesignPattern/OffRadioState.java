package EPAM.StateDesignPattern;

import java.util.logging.Logger;

public class OffRadioState implements RadioState {
	Logger logger = Logger.getLogger(OffRadioState.class.getName());
    public void execute(App radio){
    	logger.info("This method is used to check if Radio is Off");
        radio.setOn(false);
    }
}