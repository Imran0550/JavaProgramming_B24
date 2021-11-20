package officeHours.practice_11_03_2021;

public class GetEntertained {

    public static void main(String[] args) {

        NetflixShow netflixShow = new NetflixShow(90,"Game of Thrones",8,3);

        System.out.println(netflixShow.name);
        System.out.println(netflixShow.company);
        System.out.println(netflixShow.duration);


        System.out.println();
        LiveShow liveShow = new LiveShow("Youtube","Los Angeles");
        System.out.println(liveShow.name);
        System.out.println(liveShow.location);

    }
}
