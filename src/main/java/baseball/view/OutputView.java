package baseball.view;

import baseball.dto.StrikeBallDto;

public class OutputView {
    private String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private String INPUT_BALL_MESSAGE = "숫자를 입력해주세요 : %s";
    private String RESULT_STATE_MESSAGE = "";
    private String RESULT_MESSAGE = "%d개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private String RETRY_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력해주세요.";

    public void printStart() {
        System.out.println(START_MESSAGE);
    }
    public void printInputBall(String ball) {
        System.out.printf(INPUT_BALL_MESSAGE, ball);
    }
    public void printResultState(StrikeBallDto dto){
        System.out.println(RESULT_STATE_MESSAGE); //TODO: 추후에 Service계층과 같이 작성할 예정
    }
    public void printResult(int size){
        System.out.printf(RESULT_MESSAGE, size);
    }
    public void printRetry(){
        System.out.println(RETRY_MESSAGE);
    }

}
