package baseball.util;

import baseball.model.Answer;
import baseball.model.Player;
import baseball.model.Retry;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @DisplayName("Player객체 예외 검사")
    @ParameterizedTest
    @CsvSource(value = {"1234", "012", "1 3", "111"})
    void Player(String input){
        //given

        //when
        assertThatThrownBy(() -> {
            Player player = new Player();
            player.setBall(input);
        }).isInstanceOf(IllegalArgumentException.class);

        //then
    }
    @DisplayName("Answer객체 예외 검사")
    @ParameterizedTest
    @CsvSource(value = {"1234", "012", "1 3", "111"})
    void Answer(String input){
        //given

        //when
        assertThatThrownBy(() -> {
            Answer answer = new Answer(input);
        }).isInstanceOf(IllegalArgumentException.class);

        //then
    }

    @DisplayName("Retry객체 예외 검사")
    @ParameterizedTest
    @CsvSource(value = {"3", "0", "120"})
    void Retry(String input) {
        assertThatThrownBy(() -> {
            Retry.validate(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }



}