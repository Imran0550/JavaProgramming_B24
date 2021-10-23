package officeHours.Practice_10_21_2021;

public class Sport {

    private String name;
    private int numberOfPlayers;
    private boolean teamBased;

    public Sport(String name, int numberOfPlayers, boolean teamBased) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        this.teamBased = teamBased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name=name;
        }
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if(numberOfPlayers > 0){
            this.numberOfPlayers=numberOfPlayers;
        }
    }

    public boolean isTeamBased() {
        return teamBased;
    }

    public void setTeamBased(boolean teamBased) {
        this.teamBased = teamBased;
    }
}

/*
Create a class called Sport
- instance variables: name, number of players, team based (boolean)

- Create a constructor to initialize the three fields

- Encapsulate the variables

- Bonus: pervent negative number of players to assigned and null or empty space to be assigned to name
 */
