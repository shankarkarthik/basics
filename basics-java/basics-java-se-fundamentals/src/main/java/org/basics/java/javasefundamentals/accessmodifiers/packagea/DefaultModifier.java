package org.basics.java.javasefundamentals.accessmodifiers.packagea;

/**
 * Created by Archu-Anita on 6/5/2018.
 */
public class DefaultModifier {

    void doSomething(){
        System.out.println("This is only accessible from this package. It is not available for subclasses outside of package");
    }
}
