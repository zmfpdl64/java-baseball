package baseball.model;

import static baseball.util.Validator.*;

public class Retry {

    /*
    *조건
    * 1. 0 또는 1 여야 한다.
     */
    public static void validate(String retry) {
        NoneOneTwo(retry);
    }
}
