package ScoreTrack;

public class Stats {
    Teams team;
    public int setHP() {
        return ((team.getSetKills() - team.getSetErrors()) / team.getSetAttempts());
    }

    public int gameHP() {
        return ((team.getGameKills() - team.getGameErrors()) / team.getGameAttempts());
    }

    public void newGame() {
    }

    public void newSet() {

    }
}
