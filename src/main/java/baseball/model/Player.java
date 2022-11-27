package baseball.model;

import static baseball.util.Validator.*;

public class Player {
    private String ball;

    public void setBall(String ball) {
        validate(ball);
        this.ball = ball;
    }

    /*
    *조건
    * 1. 3자리여야한다.
    * 2. 1~9까지여야 한다.
    * 3. 중복되면 안된다.
     */

    private void validate(String ball) {
        OutOfRange(ball);
        NotNumber(ball);
        ImportZero(ball);
        Duplicate(ball);
    }
}
