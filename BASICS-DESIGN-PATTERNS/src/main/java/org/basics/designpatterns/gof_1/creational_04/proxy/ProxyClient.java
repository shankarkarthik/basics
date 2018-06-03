package org.basics.designpatterns.gof_1.creational_04.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 
 * @author Shankar Karthik Vaithianathan
 *
 */
public class ProxyClient {

	public void invoke(){
		IProxied withoutProxy = new Proxied();

		// Create InvokeHandler
		InvocationHandler handler = new SecurityHandler( withoutProxy );
		// Create Proxy
		IProxied withProxy = ( IProxied ) Proxy.newProxyInstance(
			withoutProxy.getClass().getClassLoader(),
			withoutProxy.getClass().getInterfaces(),
			handler);
		
		withoutProxy.ping();
		
		withProxy.ping();
	}

	public static void main( String[] args ) {
		new ProxyClient().invoke();
	}
}
