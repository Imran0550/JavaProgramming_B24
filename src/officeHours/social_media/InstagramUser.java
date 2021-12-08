package officeHours.social_media;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class InstagramUser extends SocialMedia implements hasPictures{

   private String username;
   private String password;
   private int numberOfFriends;
   private int numberOfFollowing;
   private List<String> post;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public int getNumberOfFollowing() {
        return numberOfFollowing;
    }

    public void setNumberOfFollowing(int numberOfFollowing) {
        this.numberOfFollowing = numberOfFollowing;
    }

    public List<String> getPost() {
        return post;
    }

    public void setPost(List<String> post) {
        this.post = post;
    }

    public InstagramUser(String username, String password) {
        this.username = username;
        this.password = password;
        personalUrl = "Instagram.com/"+username;
        post = new ArrayList<>();

    }

    static {
        platform = "Instagram";
    }

    @Override
    public void directMessage(SocialMedia other, String message) {
        System.out.println(message +"is sent " + other);
    }

    @Override
    public void post(String body) {

post.add(body);
    }

    @Override
    public void notification(int time) {


        if(LocalTime.now().getHour() <= 10 && LocalTime.now().getHour() <=20){
            System.out.println("Notification");
        }else {
            System.out.println("Sleep mode");
        }
    }

    @Override
    public String toString() {
        return "InstagramUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", numberOfFriends=" + numberOfFriends +
                ", numberOfFollowing=" + numberOfFollowing +
                ", post=" + post +
                '}';
    }

    @Override
    public void likePicture() {
        System.out.println(username + " liked your picture");
    }

    @Override
    public void unlikePicture() {
        System.out.println(username + " unliked your picture");
    }

    @Override
    public void sharePicture() {
        System.out.println(username + " has shared your post");
    }
}
