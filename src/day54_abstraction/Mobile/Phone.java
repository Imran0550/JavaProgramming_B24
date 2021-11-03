package day54_abstraction.Mobile;

import day54_abstraction.Mobile.Instagram;
import day54_abstraction.Mobile.MobileApp;
import day54_abstraction.Mobile.discord;

public class Phone {

    public static void main(String[] args) {
        MobileApp app = new MobileApp();
        app.setName("Instagram");
        System.out.println(app.getName());
        app.setVersion(0.15);
        app.download();
        System.out.println(app.getVersion());
        app.useApp(5);

        System.out.println();

        Instagram instagram = new Instagram();
        instagram.setName("instagram");
        instagram.setVersion(0.18);
        instagram.download();
        instagram.useApp(15);
        System.out.println();
        discord discord = new discord();
discord.setName("discord");
discord.setVersion(0.17);
        discord.useApp(5);
    }
}
