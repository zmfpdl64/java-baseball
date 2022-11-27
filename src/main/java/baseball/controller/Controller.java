package baseball.controller;

import baseball.model.Answer;
import baseball.model.BallStrike;
import baseball.model.KeepGoing;
import baseball.model.Player;
import baseball.service.BaseBallGame;
import baseball.util.MakeAnswer;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Controller {
    private final BaseBallGame game;
    private final OutputView out;
    private final InputView input;


    public Controller(BaseBallGame game, OutputView out, InputView input) {
        this.game = game;
        this.out = out;
        this.input = input;
    }

    public void playGame() {
        gameStart();
        while(game.getKeepGoing().getKeepGoing()){
            throwBall();
            if(game.getBallStrike().getBallStrike()[1] == 3 ){
                restart();
            }
        }

    }

    public void gameStart() {
        out.printStart();
        setGame();
    }

    private void setGame() {
        Answer answer = new Answer(MakeAnswer.makeRandomNumbers());
        BallStrike ballStrike = new BallStrike();
        KeepGoing keepGoing = new KeepGoing();
        Player player = new Player();
        game.setAnswer(answer);
        game.setBallStrike(ballStrike);
        game.setKeepGoing(keepGoing);
        game.setPlayer(player);
    }

    public void throwBall() {
        out.printInputBall();
        game.throwBall(input.inputBall());
        out.printResultState(game.getBallStrike());
        game.initBallStrike();
    }
    public void restart() {
        out.printRetry();
        game.retryOrEnd(input.inputRetry());
    }

}
