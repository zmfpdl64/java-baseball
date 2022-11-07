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


    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}