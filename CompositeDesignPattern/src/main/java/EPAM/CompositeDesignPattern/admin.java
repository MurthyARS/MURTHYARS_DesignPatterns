package EPAM.CompositeDesignPattern;

import java.util.logging.Logger;

public class admin implements Details  { 
	Logger logger = Logger.getLogger(admin.class.getName());
    private String name; 
    private long empId; 
    private String position; 
  
    public admin(long empId, String name, String position)  { 
        this.empId = empId; 
        this.name = name; 
        this.position = position; 
    }    
    public void showDetails()   { 
        logger.info(empId+" " +name+" "+position); 
    } 
} 
