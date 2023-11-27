package baseball.view;

import baseball.utils.PrintUtils;
import baseball.utils.PrintUtils.*;
import baseball.utils.Validator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private final Validator validator = new Validator();
    private final PrintUtils printUtils = new PrintUtils();
    public String userNumbers() {
        printUtils.printQuestion();
        String userNumbers = Console.readLine();
        validator.isNullOrEmpty(userNumbers);
        return userNumbers;
    }

    public String gameRestart() {
        printUtils.printRestartQuestion();
        String gameRestart = Console.readLine();
        validator.isNullOrEmpty(gameRestart);
        return gameRestart;
    }
}
