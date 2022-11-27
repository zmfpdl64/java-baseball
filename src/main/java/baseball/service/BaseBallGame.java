package baseball.service;

import baseball.model.Answer;
import baseball.model.BallStrike;
import baseball.model.KeepGoing;
import baseball.model.Player;

public class BaseBallGame {

    private KeepGoing keepGoing;
    private Player player;
    private Answer answer;
    private BallStrike ballStrike;

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }



    public void throwBall(String ball){
        player.setBall(ball);
        compareAnswer(answer.getAnswer(), ball);


    }

    private void compareAnswer(String answer, String ball){
        checkStrike(answer, ball);
        checkBall(answer, ball);
    }

    private void checkStrike(String answer, String ball) {
        for(int i = 0; i < answer.length(); i++){
            if(answer.charAt(i)==ball.charAt(i)){
                ballStrike.plusStrikeCount();
            }
        }

    }
    private void checkBall(String answer, String ball) {    // TODO: 리펙토링 해줄 것
        for(int i = 0; i < answer.length(); i++){
            for(int j = 0; j < answer.length(); j++){
                if(i != j && answer.charAt(i) == ball.charAt(j)){
                    ballStrike.plusBallCount();
                }
            }
        }
    }

    public BallStrike getBallStrike(){
        return ballStrike;
    }



}
