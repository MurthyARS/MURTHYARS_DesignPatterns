package EPAM.DesignPatterns;


import java.io.Serializable;

public class Singleton implements Serializable{
	private static final long serialVersionUID = 1L;
    private Singleton(){
    }
    private static class SingletonHelper{
        private static final Singleton ins = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHelper.ins;
    }
}