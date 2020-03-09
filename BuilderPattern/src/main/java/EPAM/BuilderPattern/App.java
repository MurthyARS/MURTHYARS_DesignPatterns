package EPAM.BuilderPattern;

import java.util.logging.Logger;

public class App  {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(App.class.getName());
	    User user1 = new User.UserBuilder("Ramesh", "Gupta")
	    .age(30)
	    .phone("948374859")
	    .address("Fake address")
	    .build();
	    logger.info("Detials of user1:\n"+user1);
	 
	    User user2 = new User.UserBuilder("Amelie", "Johnson")
	    .age(40)
	    .phone("859649696")
	    .build();
	    logger.info("Detials of user2\n:"+user2);
	 
	    User user3 = new User.UserBuilder("Justin", "Bieber")
	    .build();
	    logger.info("Detials of user3:\n"+user3);
	}
}