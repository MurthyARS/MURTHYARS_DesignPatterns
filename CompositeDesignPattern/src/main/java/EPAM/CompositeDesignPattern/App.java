package EPAM.CompositeDesignPattern;

public class App  { 
    public static void main (String[] args)  { 
    	Teacher prg1 = new Teacher(100, "Dinesh Yadav", "Assistant Prof"); 
    	Teacher prg2 = new Teacher(101, "Vinay Raghav", "Professor"); 
        DetailsRegister engreg = new DetailsRegister(); 
        engreg.addEmployee(prg1); 
        engreg.addEmployee(prg2); 
          
        admin man1 = new admin(200, "Vijay Kumar", "SEO Manager"); 
        admin man2 = new admin(201, "Vikram Bhatia ", "Stock Manager"); 
          
        DetailsRegister accreg = new DetailsRegister(); 
        accreg.addEmployee(man1); 
        accreg.addEmployee(man2); 
      
        DetailsRegister reg = new DetailsRegister(); 
        reg.addEmployee(engreg); 
        reg.addEmployee(engreg); 
        reg.showDetails(); 
    } 
} 