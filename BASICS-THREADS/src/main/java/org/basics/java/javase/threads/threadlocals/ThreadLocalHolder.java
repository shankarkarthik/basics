package org.basics.java.javase.threads.threadlocals;

public class ThreadLocalHolder {
	
	private static final ThreadLocal<String> userNameHolder = new InheritableThreadLocal<String>(); 

	
    public static void setUserName( String userName ) {	
    	userNameHolder.set( userName );	
    }

    public static String getUserName() {
        if ( userNameHolder.get() == null) {
            return null;
        }
        return userNameHolder.get();
    }

}
