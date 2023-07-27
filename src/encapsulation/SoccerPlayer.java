package encapsulation;

public class SoccerPlayer {
    private String name;
    private int nameOfShirt;
    private int goalsScored;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNameOfShirt() {
        return nameOfShirt;
    }

    public void setNameOfShirt(int nameOfShirt) {
        this.nameOfShirt = nameOfShirt;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }
}
