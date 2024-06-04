package com.designpattern.singletoneDesignPattern;

public class Samosa {

    private static Samosa samosa = null;

    private Samosa() {

    }

    // this way is not thread safe
    public static Samosa getInstance() {
        if (samosa == null) {
            samosa = new Samosa();  //This is lazy initialization when client required then you create object
        }
        return samosa;
    }

    //for thread safe use the following code
    public static Samosa getInstanceThreadSafe() {
        if (samosa == null) {
            synchronized (Samosa.class) { //using synchronized block
                if (samosa == null) {
                    samosa = new Samosa();
                }
                return samosa;
            }
        }
        return samosa;
    }
}
