package officeHours.Practice_10_21_2021;

public class Team {
    public static void main(String[] args) {


        Sport sport = new Sport("Ahmad", 8, true);

        System.out.println(sport.getName());
        System.out.println(sport.isTeamBased());
        System.out.println(sport.getNumberOfPlayers());

        sport.setNumberOfPlayers(-1);
        System.out.println(sport.getNumberOfPlayers());
        sport.setName("");
        System.out.println(sport.getName());
        sport.setTeamBased(false);
        System.out.println(sport.isTeamBased());

    }
}
