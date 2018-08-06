
package com.jda.main;

import java.lang.reflect.Constructor;

import com.jda.creationalDesignPatterns.StaticBlockSingleton;

public class Static
{
    public static void main(String[] args) {
   	 StaticBlockSingleton instanceOne = StaticBlockSingleton.getInstance();
   	 StaticBlockSingleton instanceTwo = null;
        try {
            Constructor[] constructors = StaticBlockSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (StaticBlockSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
