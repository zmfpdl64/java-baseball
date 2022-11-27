package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String inputBall() {
        return input();
    }

    public String inputRetry() {
        return input();
    }

    private String input() {
        return Console.readLine();
    }
}
