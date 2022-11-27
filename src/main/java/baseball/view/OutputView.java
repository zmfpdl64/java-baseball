package baseball.view;

import baseball.model.BallStrike;

public class OutputView {
    private String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private String INPUT_BALL_MESSAGE = "숫자를 입력해주세요 : ";
    private String BALL_MESSAGE = "%d볼";
    private String STRIKE_MESSAGE = "%d스트라이크";
    private String RESULT_MESSAGE = "%d개의 숫자를 모두 맞히셨습니다! 게임 종료%n";
    private String RETRY_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력해주세요.";

    public void printStart() {
        System.out.println(START_MESSAGE);
    }
    public void printInputBall() {
        System.out.printf(INPUT_BALL_MESSAGE);
    }
    public void printResultState(BallStrike ballStrike){
        int ball = ballStrike.getBallStrike()[0];
        int strike = ballStrike.getBallStrike()[1];
        String answer = getBall(ball) + getStrike(strike);
        if(answer.isEmpty()){
            System.out.println("낫싱");
            return;
        }
        System.out.println(answer);


    }
    private String getBall(int ball){
        if(ball > 0){
            return String.format(BALL_MESSAGE, ball);
        }
        return "";
    }
    private String getStrike(int strike) {
        if(strike > 0) {
            return String.format(STRIKE_MESSAGE, strike);
        }
        return "";
    }
    public void printResult(int size){
        System.out.printf(RESULT_MESSAGE, size);
    }
    public void printRetry(){
        System.out.println(RETRY_MESSAGE);
    }

}
