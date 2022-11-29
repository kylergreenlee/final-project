package ScoreTrack;

import javafx.scene.paint.Color;

public class Teams {
    private Color color;

    private int setAttempts;
    private int setKills;
    private int setErrors;
    private int gameAttempts;
    private int gameKills;
    private int gameErrors;

    public void initialize(){

    }

    public void addAttempt(){
        setAttempts += 1;
        gameAttempts += 1;
    }

    public void addKill(){
        addAttempt();
        setKills += 1;
        gameKills += 1;
    }

    public void addError(){
        addAttempt();
        setErrors += 1;
        gameErrors += 1;
    }

    public int getSetAttempts(){
        return setAttempts;
    }

    public int getGameAttempts(){
        return gameAttempts;
    }

    public int getSetKills(){
        return setKills;
    }

    public int getGameKills(){
        return gameKills;
    }

    public int getSetErrors(){
        return setErrors;
    }

    public int getGameErrors(){
        return gameErrors;
    }

    public void newGame(){
        setAttempts = 0;
        setErrors = 0;
        setKills = 0;
        gameAttempts = 0;
        gameErrors = 0;
        gameKills = 0;
    }

    public void newSet(){
        setAttempts = 0;
        setKills = 0;
        setErrors = 0;
    }


}
