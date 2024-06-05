package com.designpattern.durgeshYouTube.protoTypeDesignpattern;

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        System.out.println("Creating object using prototype design pattern");
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("199.11.00");
        networkConnection.loadImportantData();
        networkConnection.loadDomains();
        System.out.println(networkConnection.toString());

        //This method will provide you shallow copy of object
        /*
        * Shallow Copy: In this concept if you clone the object it provide you reference of Object that is available inside the clone object
        *
        *Deep Copy: In this concept you clone the object it will  provide separate copy of all object that is in clone object.
        *
        * */
        NetworkConnection connection1 = (NetworkConnection) networkConnection.clone();
        NetworkConnection connection2 = (NetworkConnection) networkConnection.clone();
        NetworkConnection connection3 = (NetworkConnection) networkConnection.clone();
        connection1.getDomains().remove(0);
        System.out.println(connection1.toString());
        System.out.println(connection2.toString());
        System.out.println(connection3.toString());
    }
}
