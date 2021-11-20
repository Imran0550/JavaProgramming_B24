package giventasks.socialmedia;

public class PostClass {

   private String body;
    final String dateTime;

    public PostClass(String dateTime) {
        this.dateTime = dateTime;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
