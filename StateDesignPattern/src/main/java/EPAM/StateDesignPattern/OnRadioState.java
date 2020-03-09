package EPAM.StateDesignPattern;

import java.util.logging.Logger;

public class OnRadioState implements RadioState {
	Logger logger = Logger.getLogger(OnRadioState.class.getName());
    public void execute(App radio){
    	logger.info("This method is used to check if Radio is On");
        radio.setOn(true);
    }
}