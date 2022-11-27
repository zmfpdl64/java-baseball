package baseball.util;

import baseball.model.Answer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MakeAnswerTest {
    @DisplayName("정답 생성기 테스트")
    @Test
    void makeRandomNumbers() {
        //given
        MakeAnswer makeAnswer = new MakeAnswer();

        //when
        String numbers = makeAnswer.makeRandomNumbers();
        Answer answer = new Answer(numbers);

        //then
        assertThat(answer.getAnswer()).isEqualTo(numbers);

    }

}