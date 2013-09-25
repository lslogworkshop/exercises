package com.leapset;
 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.*;
 
public class LoggingServlet extends HttpServlet{

	private static Logger logger = Logger.getLogger(LoggingServlet.class.getName());
 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {		
		logger.info("Executed doGet in LoggingServlet.");    	
    	
        PrintWriter writer = response.getWriter();
    	writer.println("Check your web server console...");
    	writer.flush();
    	writer.close();
	}
}