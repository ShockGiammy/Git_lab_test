package main.java;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

    public static void main(String[] args) {
    	  	
    	Logger logger = createLogger();
    	logger.log(Level.INFO, "Hello, World!");    
    }
    
    public static Logger createLogger() {
    	Logger logger = Logger.getLogger(HelloWorld.class.getName());
    	logger.log(Level.INFO, "Logger correctly created.");
        return logger;
    }
}
