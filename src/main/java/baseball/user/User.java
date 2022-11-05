package baseball.user;

import baseball.valid.Valid;
import camp.nextstep.edu.missionutils.Console;

public class User {

    private int number;

    public int inputNumber() {
        int number = -1;
        while(number == -1){
            number = Valid.userInput(Console.readLine());
        }
        this.number = number;
        return number;
    }


    public int getNumber() {
        return number;
    }
}
