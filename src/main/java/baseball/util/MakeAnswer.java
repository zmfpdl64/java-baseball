package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class MakeAnswer {

    private static final int MAX = 9;
    private static final int MIN = 1;
    private static final int SIZE = 3;

    public static String makeRandomNumbers() {
        List<String> answer = new ArrayList<>();
        while(answer.size() < 3) {
            String num = makeRandomNum();
            if(!answer.contains(num)){
                answer.add(num);
            }
        }
        return String.join("", answer);
    }

    private static String makeRandomNum(){
        return String.valueOf(Randoms.pickNumberInRange(MIN, MAX));
    }

}
