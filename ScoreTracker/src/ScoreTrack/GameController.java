package ScoreTrack;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class GameController {
    @FXML
    public Button previousGame;
    @FXML
    public Button nextGame;
    @FXML
    public Button attemptTeam1;
    @FXML
    public Button attemptTeam2;
    @FXML
    public Button killTeam1;
    @FXML
    Button killTeam2;
    @FXML
    public Button errorTeam1;
    @FXML
    public Button errorTeam2;
    @FXML
    public TextArea team1SetHP;
    @FXML
    public TextArea team2SetHP;
    @FXML
    public TextArea team1GameHP;
    @FXML
    public TextArea team2GameHP;
    @FXML
    public Button addScore1;
    @FXML
    public Button addScore2;
    @FXML
    public Button newGame;
    @FXML
    public TextArea score1;
    @FXML
    public TextArea score2;
    @FXML
    public BorderPane borderPane;
    private Game game;
    private GameView gameView;
    private Movement movement;

    private class Movement extends AnimationTimer {

        private long FRAMES_PER_SEC = 50L;
        private long INTERVAL = 1000000000L / FRAMES_PER_SEC;

        private long last = 0;


        @Override
        public void handle(long now) {
            if (now - last > INTERVAL) {
                gameView.update();
              //  updateViews();
                last = now;
            }
        }
    }

        @FXML
        public void initialize() {
            game = new Game();
            gameView = new GameView(1, 1,game);
            borderPane.getChildren().add(gameView);
            movement = new Movement();
            movement.start();
            updateViews();
        }
        @FXML
        public void addAttemptTeam1(){
        
        }

        @FXML
        public void addScoreTeam1() {
            if (!game.setOver() && !game.gameOver()) {
                game.addScore1();
                score1.setText(game.getTeam1Score() + "");
                //movement.stop();
            }
            else if (game.whoWon()){
                score2.setText("");
                score1.setText("");
                movement.start();
                gameView.increaseSets1(33);
            }
            else {
                score2.setText("");
                score1.setText("");
                movement.start();
                gameView.increaseSets2(33);
            }
        }

        @FXML
        public void addScoreTeam2() {
            if (!game.setOver() && !game.gameOver()) {
                game.addScore2();
                score2.setText(game.getTeam2Score() + "");

            }
            else if (!game.whoWon()){
                score2.setText("");
                score1.setText("");
                movement.start();
                gameView.increaseSets2(33);
            }
            else {
                score2.setText("");
                score1.setText("");
                movement.start();
                gameView.increaseSets2(33);
            }
        }
        @FXML
        public void setNewGame(){
            gameView.NewGame();
            game.NewGame();
            movement.stop();
            updateViews();
        }

        @FXML
        public void updateViews() {
            gameView.update();
        }

    }
