javac -cp ../libs/log4j-1.2.17.jar SimpleFileLogging.java
java -cp ../libs/log4j-1.2.17.jar:./ -Dlog4j.configuration=log4j.properties SimpleFileLogging
