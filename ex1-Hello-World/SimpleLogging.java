import org.apache.log4j.*;

public class SimpleLogging {

	private static Logger logger = Logger.getLogger(SimpleLogging.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        logger.info("Hello this is an info message");
	} 
}