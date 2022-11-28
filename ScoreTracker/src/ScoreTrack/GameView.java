package ScoreTrack;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class GameView extends Parent {
    private Rectangle sets1;
    private Rectangle sets2;

    private double sets1Width;

    private double sets2Width;

    private Game game;

    public GameView(double sets1Width, double sets2Width, Game game) {
        this.sets1Width = sets1Width;
        this.sets2Width = sets2Width;
        this.game = game;

        sets1 = new Rectangle();
        sets1.setX(130);
        sets1.setY(345);
        sets1.setHeight(15);
        sets1.setWidth(sets1Width);
        sets1.setFill(Color.PEACHPUFF);
        sets1.setStrokeWidth(15);
        getChildren().add(sets1);


        sets2 = new Rectangle();
        sets2.setX(335);
        sets2.setY(345);
        sets2.setHeight(15);
        sets2.setWidth(sets2Width);
        sets2.setFill(Color.AQUA);
        sets2.setStrokeWidth(15);
        getChildren().add(sets2);

    }

    public void increaseSets1(double currentBarWidth) {
        sets1Width += currentBarWidth;
    }
    public void increaseSets2(double currentBarWidth) {
        sets2Width += currentBarWidth;
    }

    public void NewGame(){
        sets1.setWidth(1);
        sets2.setWidth(1);
        sets1Width = 1;
        sets2Width = 1;
        game.NewGame();
    }
    public void update() {
        //System.out.println(sets1Width);
        if (sets1.getWidth() < sets1Width) {
            sets1.setWidth(sets1.getWidth() + 0.1);
        //    System.out.println("working");
        }
        if (sets2.getWidth() < sets2Width) {
            sets2.setWidth(sets2.getWidth() + 0.1);
        }
    }
}
