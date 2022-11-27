package baseball.service;

import baseball.model.Answer;
import baseball.model.BallStrike;
import baseball.model.KeepGoing;
import baseball.model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseBallGameTest {

    private BaseBallGame game;

    @BeforeEach
    void beforeEach() {
        game = new BaseBallGame();
        game.setPlayer(new Player());
        game.setBallStrike(new BallStrike());
        game.setKeepGoing(new KeepGoing());
        String input_answer = "123";
        Answer answer = new Answer(input_answer);
        game.setAnswer(answer);
    }

    @DisplayName("공 던지고 볼, 스트라이크 결과 테스트")
    @Test
    void throwBall() {
        //given
        String ball = "123";
        int expect_ball = 0;
        int expect_strike = 3;

        //when
        game.throwBall(ball);
        BallStrike ballStrike = game.getBallStrike();

        //then
        assertThat(ballStrike.getBallStrike()[0]).isEqualTo(expect_ball);
        assertThat(ballStrike.getBallStrike()[1]).isEqualTo(expect_strike);

    }

    @DisplayName("재시작 값을 입력받았을 때 초기화 테스트")
    @Test
    void retryOrEnd() {
        //given
        String retry = "1";
        int expect_ballstrike = 0;
        String expect_answer = "234";

        //when
        game.retryOrEnd(retry);
        int ball = game.getBallStrike().getBallStrike()[0];
        int strike = game.getBallStrike().getBallStrike()[1];
        String answer = game.getAnswer().getAnswer();

        //then
        assertThat(ball).isEqualTo(expect_ballstrike);
        assertThat(ball).isEqualTo(expect_ballstrike);
        assertThat(answer).isEqualTo(expect_answer);
    }

    @DisplayName("종료값 전달했을 때 KeepGoing인자가 false로 변경되는가?")
    @Test
    void End() {
        //given
        String end = "2";
        Boolean expect_result = false;

        //when
        game.retryOrEnd(end);
        Boolean keepGoing = game.getKeepGoing().getKeepGoing();

        //then
        assertThat(keepGoing).isEqualTo(expect_result);
    }
}
