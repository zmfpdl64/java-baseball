package baseball.model;

public class Player {
    private String ball;

    public void setBall(String ball) {
        validate(ball);
        this.ball = ball;
    }

    private void validate(String ball) {

    }
}
