package org.basics.java.ood.overriding;

/**
 * Created by Archu-Anita on 6/5/2018.
 */
public class OverridableClass {

    public void overrideMe1(){
        System.out.println(this.getClass().getCanonicalName());
    }

    protected void overrideMe2(){
        System.out.println(this.getClass().getCanonicalName());
    }

}
