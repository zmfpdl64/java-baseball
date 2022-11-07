package baseball.game;

import baseball.Application;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseBallTest extends NsTest {

    @Test
    void checkStrike() {
        BaseBall game = new BaseBall();
        int num1 = 123;
        int num2 = 321;
        int result = 1;
        game.checkStrike(num1, num2);
        assertThat(game.strike).isEqualTo(result);
    }

    @Test
    void checkBall() {
        BaseBall game = new BaseBall();
        int num1 = 123;
        int num2 = 321;
        int result = 2;
        game.checkBall(num1, num2);
        assertThat(game.ball).isEqualTo(result);
    }

    @Test
    void init_Strike_Ball() {
        BaseBall game = new BaseBall();
        game.strike = 10;
        game.ball = 5;
        game.init_Strike_Ball();
        assertThat(game.ball).isEqualTo(0);
        assertThat(game.strike).isEqualTo(0);
    }
    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
