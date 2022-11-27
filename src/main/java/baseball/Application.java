package baseball;

import baseball.controller.Controller;
import baseball.service.BaseBallGame;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        BaseBallGame game = new BaseBallGame();
        Controller controller = new Controller(game, outputView, inputView);
        controller.playGame();
    }
}
