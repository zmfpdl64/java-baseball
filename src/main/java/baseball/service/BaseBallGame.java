package baseball.service;

import baseball.model.*;

public class BaseBallGame {

    private KeepGoing keepGoing;
    private Player player;
    private Answer answer;
    private BallStrike ballStrike;

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setBallStrike(BallStrike ballStrike) {
        this.ballStrike = ballStrike;
    }

    public void setKeepGoing(KeepGoing keepGoing) {
        this.keepGoing = keepGoing;
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

    public void retryOrEnd(String retry) {
        Retry.validate(retry);
        if(retry.equals("1")){ // TODO: 리펙토링 해줄 것
            retry();
            return;
        }
        end();
    }
    private void retry(){
        setAnswer(new Answer("234")); // TODO: Randoms.pick 적용 하기
        initBallStrike();
        return;
    }

    private void end() {
        keepGoing.Stop();
    }

    private void initBallStrike() {
        setBallStrike(new BallStrike());
    }

    public BallStrike getBallStrike(){
        return ballStrike;
    }
    public Answer getAnswer() {
        return answer;
    }



}
