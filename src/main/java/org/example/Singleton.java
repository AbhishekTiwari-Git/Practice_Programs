package org.example;

public class Singleton {
    private static Singleton singleton_instance = null;
    public String str;
    private Singleton(){
        str = "I am Singleton";
    }

    public static Singleton getInstance(){
        if(singleton_instance == null){
            synchronized (Singleton.class){
                if(singleton_instance == null) {
                    singleton_instance = new Singleton();
                }
            }}
        return singleton_instance;
    }
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.str = (x.str).toUpperCase();
        System.out.println(x.str);
    }
}
