package baseball.model;

import static baseball.util.Validator.*;

public class Answer {
    private final String answer;
/*
* 조건
* 1. 3자리여야 한다.
* 2. 1~9까지의 숫자여야한다.
* 3. 각 자리가 중복되면 안된다.
 */
    public Answer(String answer) {
        this.answer = answer;
    }
    public String getAnswer() {
        return this.answer;
    }
    private void validate(String answer) {
        OutOfRange(answer);
        NotNumber(answer);
        ImportZero(answer);
        Duplicate(answer);
    }
}
