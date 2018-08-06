
package com.jda.creationalDesignPatterns;

public enum EnumSingleton {

    INSTANCE;
    
    public static void doSomething(){
        System.out.println(INSTANCE.hashCode());
    }
}
