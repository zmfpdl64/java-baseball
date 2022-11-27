package baseball.controller;

import baseball.model.Answer;
import baseball.model.BallStrike;
import baseball.model.KeepGoing;
import baseball.model.Player;
import baseball.service.BaseBallGame;

public class Controller {
    private final BaseBallGame game;

    public Controller(BaseBallGame game) {
        this.game = game;
    }

    public void playGame() {
        gameStart();
//        지금 게임을 유지 할건지
        throwBall();
        restart();
        end();

    }

    public void gameStart() {
        Answer answer = new Answer("123"); // TODO: 리펙토링 예정
        BallStrike ballStrike = new BallStrike();
        KeepGoing keepGoing = new KeepGoing();
        Player player = new Player();
        game.setAnswer(answer);
        game.setBallStrike(ballStrike);
        game.setKeepGoing(keepGoing);
        game.setPlayer(player);
    }

    public void throwBall() {

    }
    public void restart() {

    }
    public void end() {

    }


}
