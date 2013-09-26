javac -cp ../libs/log4j-1.2.17.jar LocaleSupport.java
java -cp ../libs/log4j-1.2.17.jar:./ -Dlog4j.configuration=log4j.properties -Dfile.encoding=UTF-8 LocaleSupport logging_fr

