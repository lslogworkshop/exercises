import org.apache.log4j.*;

public class ConsoleAndFileLogging {

	private static Logger logger = Logger.getLogger(ConsoleAndFileLogging.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	logger.info("This is a log message");
    	logger.warn("This is a warn message");
    	
        logger.error("Hello this a error message");
        logger.fatal("This is a fatal message");
	} 
}