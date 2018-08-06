
package com.jda.main;

import java.lang.reflect.Constructor;

import com.jda.creationalDesignPatterns.LazyInitializedSingleton;

public class Lazy {

    public static void main(String[] args) {
   	 LazyInitializedSingleton instanceOne = LazyInitializedSingleton.getInstance();
   	 LazyInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = LazyInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (LazyInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
