package day45_constructors;

import day45_constructors.App;

public class UsingApp {

    public static void main(String[] args) {

        App appOne = new App();

        appOne.name ="Cybertek";
        appOne.version = 10.2;
        appOne.isFree = true;

        appOne.update();

        System.out.println("Name: "+ appOne.name);
        System.out.println("Version: "+appOne.version);
        System.out.println(appOne.isFree ? "Yes, its free": "No, it costs money");

    }
}
