import org.apache.log4j.*;

public class ConsoleLogging {

	private static Logger logger = Logger.getLogger(ConsoleLogging.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        logger.fatal("Hello this is an info message");
	} 
}