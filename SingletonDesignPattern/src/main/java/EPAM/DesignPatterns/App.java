package EPAM.DesignPatterns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;


public class App 
{
	 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	        Singleton instOne = Singleton.getInstance();
	        Logger logger = Logger.getLogger(Singleton.class.getName());
	        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
	        out.writeObject(instOne);
	        out.close();
	        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
	        Singleton instTwo = (Singleton) in.readObject();
	        in.close();
	        logger.info("InstanceOne hashCode="+instOne.hashCode());
	        logger.info("InstanceTwo hashCode="+instTwo.hashCode());   
	    }
}

