package EPAM.StateDesignPattern;

public class App {
    private boolean on;
    private RadioState state;
    public App(RadioState state){
        this.state = state;
    }
    public void execute(){
        state.execute(this);
    }
    public void setState(RadioState state){
        this.state = state;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public boolean isOn(){
        return on;
    }
    public boolean isOff(){
        return !on;
    }
    public static void main(String[] args) {
    	App radio = new App(new OffRadioState()); 
    	radio.setState(new OnRadioState());
    	radio.execute(); 
    	radio.setState(new OffRadioState());
    	radio.execute(); 
    }
}
