package baseball.model;

public class BallStrike {
    int[] ballStrike = new int[]{0, 0};;

    public void plusBallCount() {
        ballStrike[0] += 1;
    }
    public void plusStrikeCount() {
        ballStrike[1] += 1;
    }
    public int[] getBallStrike() {
        return this.ballStrike;
    }

}
