package encapsulation;

public class MainSoccerPlayer {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        soccerPlayer.setName("Jan");
        soccerPlayer.setGoalsScored(3);
        soccerPlayer.setNameOfShirt(10);
        System.out.println(soccerPlayer.getName()+" goal: "+soccerPlayer.getGoalsScored()+" shirt: "+ soccerPlayer.getNameOfShirt());
    }
}

