package org.basics.java.ood.overriding;

/**
 * Created by Archu-Anita on 6/5/2018.
 */
public class SubOverridableClass extends OverridableClass {

    @Override
    public void overrideMe1(){
        System.out.println(this.getClass().getCanonicalName());
    }


    @Override
    public void overrideMe2(){
        System.out.println("You can override a protected to public" + this.getClass().getCanonicalName());
    }


}
