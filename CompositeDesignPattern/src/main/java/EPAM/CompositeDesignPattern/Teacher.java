package EPAM.CompositeDesignPattern;

import java.util.logging.Logger;

public class Teacher implements Details  { 
	Logger logger = Logger.getLogger(Teacher.class.getName());
	private String name; 
	private long empId; 
	private String position; 

	public Teacher(long empId, String name, String position) 
	{ 
		this.empId = empId; 
		this.name = name; 
		this.position = position; 
	}

	public void showDetails() {
		logger.info(empId+" " +name+" "+position);
		
	} 
	
	
} 