cd loggingdemo
javac src/com/leapset/LoggingServlet.java -cp ../../libs/servlet-api.jar:../../libs/log4j-1.2.17.jar -d WEB-INF/classes/
cp -R ../loggingdemo /home/chaminda/workspace/apache-tomcat-7.0.42/webapps/
rm -R /home/chaminda/workspace/apache-tomcat-7.0.42/webapps/loggingdemo/src

