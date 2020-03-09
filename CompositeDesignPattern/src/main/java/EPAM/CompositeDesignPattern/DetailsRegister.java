package EPAM.CompositeDesignPattern;

import java.util.ArrayList; 
import java.util.List; 

public class DetailsRegister implements Details  { 
    private List<Details> employeeList = new ArrayList<Details>(); 
       
    public void showDetails()   { 
        for(Details emp:employeeList) 
        { 
            emp.showDetails(); 
        } 
    }   
    public void addEmployee(Details emp)  { 
        employeeList.add(emp); 
    }     
    public void removeEmployee(Details emp)   { 
        employeeList.remove(emp); 
    } 
} 