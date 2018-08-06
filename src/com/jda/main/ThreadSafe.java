
package com.jda.main;

import java.lang.reflect.Constructor;

import com.jda.creationalDesignPatterns.ThreadSafeSingleton;

public class ThreadSafe {

    public static void main(String[] args) {
   	 ThreadSafeSingleton instanceOne = ThreadSafeSingleton.getInstance();
   	 ThreadSafeSingleton instanceDoubleLocking=ThreadSafeSingleton.getInstanceUsingDoubleLocking();
   	 ThreadSafeSingleton instanceTwo = null;
        try {
            Constructor[] constructors = ThreadSafeSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (ThreadSafeSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
        System.out.println(instanceDoubleLocking.hashCode());
    }

}
