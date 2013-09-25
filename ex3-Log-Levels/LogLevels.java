import org.apache.log4j.*;

public class LogLevels {

	private static Logger logger = Logger.getLogger(LogLevels.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        logger.debug("---------------------------------------");
        logger.debug("This is a debug message");
        logger.log(Level.DEBUG, "This is another debug message");

        logger.info("---------------------------------------");
        logger.info("This is an info message");
        logger.log(Level.INFO, "This is another info message");

		logger.warn("---------------------------------------");
        logger.warn("This is a warn message");
        logger.log(Level.WARN, "This is another warn message");

        logger.error("---------------------------------------");
        logger.error("This is an error message");
        logger.log(Level.ERROR, "This is another error message");
        
        logger.fatal("---------------------------------------");
        logger.fatal("This is a fatal message");
        logger.log(Level.FATAL, "This is another fatal message");
	} 
}