package officeHours.practice_11_03_2021;

import java.util.ArrayList;

public class Youtube extends Streaming{

    String videoName;
    String channelName;
    int viewCount;
    ArrayList<String> comments;
    public Youtube( double duration,String videoName,String channelName, int viewCount) {
        super("Youtube", duration);
        this.videoName = videoName;
        this.channelName = channelName;
        this.viewCount = viewCount;

        comments = new ArrayList<>();

    }
}
/*
create a class Youtube
-> Youtube is a child of Streaming
instance variables:
- video name (String)
- channel name (String)
- view count (int)
- comments (ArrayList of Strings)
constructor:
- initialize name, company, duration, video name, channel name, view
count, and comments
 */