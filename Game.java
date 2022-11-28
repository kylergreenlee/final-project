package ScoreTrack;

import java.security.KeyStore;

public class Game {
    private int team1Score;
    private int team2Score;
    private int team1Sets;
    private int team2Sets;
    public int setWon;

    public void addScore1(){
        team1Score += 1;
    }

    public void addScore2(){
        team2Score += 1;
    }

    public boolean setOver(){
        if ((team1Score >= 25) && ((team1Score - team2Score) > 1)){
            team1Sets += 1;
            team1Score = 0;
            team2Score = 0;
            setWon = 1;
            return true;
        }
        if ((team2Score >= 25) && ((team2Score - team1Score) > 1)){
            team2Sets += 1;
            team1Score = 0;
            team2Score = 0;
            setWon = 2;
            return true;
        }
        return false;
    }


    public void NewGame(){
        team1Score = 0;
        team2Score = 0;
        team1Sets = 0;
        team2Sets = 0;
    }
    public Game(){
        team1Score = 0;
        team2Score = 0;
        team1Sets = 0;
        team2Sets = 0;

    }
    public boolean gameOver(){
        if (team2Sets == 3 || team1Sets == 3){
            return true;
        }
        return false;
    }

    public int getTeam1Score(){
        return team1Score;
    }
    public int getTeam2Score(){
        return team2Score;
    }

    public boolean whoWon(){
        if (setWon == 1){
            setWon = 0;
            return true;
        }
        else {
            setWon = 0;
            return false;
        }
    }


}
