package baseball.view;

import baseball.utils.PrintUtils;
import baseball.utils.PrintUtils.*;
import baseball.utils.Validator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final Validator validator = new Validator();

    public static String userNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        String userNumbers = Console.readLine();
        validator.isNullOrEmpty(userNumbers);
        System.out.println();
        return userNumbers;
    }

    public static String gameRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String gameRestart = Console.readLine();
        validator.isNullOrEmpty(gameRestart);
        return gameRestart;
    }
}
