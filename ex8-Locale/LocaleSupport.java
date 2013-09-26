import org.apache.log4j.*;

public class LocaleSupport {

    	private static Logger logger = Logger.getLogger(LocaleSupport.class.getName());

	/** Creates a new instance of LoggerDemo */
	public LocaleSupport(String rbName) {
		
		logger.debug("Set the resource bundle...");
		logger.setResourceBundle(java.util.ResourceBundle.getBundle(rbName));
	}

	/** demonstrates the localized logging methods
	*/
	public void doLocalizedLogging() {
		logger.l7dlog(Level.DEBUG, "Entry", null);
		logger.l7dlog(Level.DEBUG, "Exit", null);
	}

	public static void main(String args[]) {
		String rbName = args[0];
		LocaleSupport demo = new LocaleSupport(rbName);
		demo.doLocalizedLogging();
	}
 
}
