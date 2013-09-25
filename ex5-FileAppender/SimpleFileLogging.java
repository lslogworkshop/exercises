import org.apache.log4j.*;

public class SimpleFileLogging {

    private static Logger logger = Logger.getLogger(SimpleFileLogging.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        logger.info("Executing main(), log4j demo");

        int i = 1;

        while(true) {
            logger.debug("Exeuted while loop " + i + " time(s)");
            i++;
            Thread.sleep(5000);
        }
	} 
}