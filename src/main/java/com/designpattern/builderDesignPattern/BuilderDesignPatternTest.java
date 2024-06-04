package com.designpattern.builderDesignPattern;

public class BuilderDesignPatternTest {
    public static void main(String[] agr){
        System.out.println("This is main class==================");
        /*we are able to do method chaining just because In the setter variable we return same class (check the User.UserBuilder class)*/
        User rakesh = new User.UserBuilder()
                .setUserName("Rakesh")
                .setEmailId("rakesh@gmail.com")
                .setUserId("123RK")
                .build();

        System.out.println("User: "+rakesh);

        User rohitKumar = new User.UserBuilder()
                .setEmailId("rk@gmail.com")
                .setUserName("Rohit Kumar")
                .setUserId("123")
                .build();

        System.out.println("User : "+ rohitKumar);

    }
}
