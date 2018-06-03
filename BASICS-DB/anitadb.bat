SET JAVA_HOME=C:\Programs\Java\jdk1.7.0_01
SET PATH=%JAVA_HOME%\bin;%PATH%;

SET DB_HOME=%CD%
SET HSQL_HOME=..\BASICS-EXT-LIB\hsqldb-2.2.8\hsqldb\lib
SET DB_DIRECTORY=ANITA-DB
SET DB_NAME=anitahsqldb
java -cp %HSQL_HOME%\hsqldb.jar org.hsqldb.Server -database.0 file:%DB_HOME%\%DB_DIRECTORY%\%DB_NAME% -dbname.0 %DB_NAME%