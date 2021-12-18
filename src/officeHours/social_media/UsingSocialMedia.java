package officeHours.social_media;

import javax.swing.*;

public class UsingSocialMedia {

    public static void main(String[] args) {


        FacebookUser imran = new FacebookUser("ImranJava", "kajsk", "Imran Nazari");


        System.out.println(imran);
        System.out.println(FacebookUser.platform);
        imran.post("Oh today was a good day");
        System.out.println(imran.getPosts());
        imran.post("OMG!");
        System.out.println(imran.getPosts());

       FacebookUser malika = new FacebookUser("MalikaSDET","adfafa","Malika Z",21,5000,10);
        System.out.println(malika);

        malika.directMessage(imran,"hello!");
        System.out.println(malika.getNumberOfGroups());
        malika.leaveGroup("friends");
        System.out.println(malika.getNumberOfGroups());
        System.out.println(malika.getNumberOfGroups());
        malika.joinGroup("good old days");
        System.out.println(malika.getNumberOfGroups());

        InstagramUser khan = new InstagramUser("imran25","jak");
        System.out.println(khan.personalUrl);
        khan.post("today is friday");
        khan.post("today is snowy");
        System.out.println(khan.getPost());
        khan.post("new pic");
        System.out.println(khan.getPost());


        khan.notification(21);

        khan.likePicture();
        khan.unlikePicture();
        khan.sharePicture();




    }
}
