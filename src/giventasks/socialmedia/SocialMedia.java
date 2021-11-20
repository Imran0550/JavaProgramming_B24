package giventasks.socialmedia;

public abstract class SocialMedia {

    public abstract String DirectMessaging(String userName, String message);
    public abstract String post(String body);
    public abstract void Notification();

    String personalURI;
    int accountLength;
    static String platform;
}
