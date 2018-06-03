/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.basics.aop.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Anita Onnuvel
 *
 */
public class AopDemo {

    /**
     * @param args
     */
    public static void main( String[] args ) {
        // Create an instance of AopSubject
        IAopSubject lAopSubject = new AopSubjectImpl();
        
        // Create InvokcationHandler (LoggingHandler)
        InvocationHandler lInvocationHandler = new LoggingHandler( lAopSubject );
        
        // Create a Dynamic proxy and Pass in 
        // a. The classLoader of the AopSubject
        // b. The ClassObject of the AopSubject
        // c. The InvocationHandler (LoggingHandler)        
        IAopSubject IAopSubjectProxy = 
                ( IAopSubject ) Proxy.newProxyInstance( lAopSubject.getClass().getClassLoader(),
                                                        lAopSubject.getClass().getInterfaces(),
                                                        lInvocationHandler );
        try {
            System.out.println( "Without AOP STARTS" );
            lAopSubject.ping();
            System.out.println( "Without AOP ENDS" );
            
            System.out.println( "#################" );
            System.out.println( "With AOP STARTS" );
            IAopSubjectProxy.ping();
            System.out.println( "With AOP ENDS" );
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }

}
