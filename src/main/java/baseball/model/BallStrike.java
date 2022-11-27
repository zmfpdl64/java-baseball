package baseball.model;

public class BallStrike {
    int[] ballStrike;

    public BallStrike() {
        ballStrike = new int[]{0, 0};
    }

    public void plusBallCount() {
        ballStrike[0] += 1;
    }
    public void plusStrikeCount() {
        ballStrike[1] += 1;
    }

}
