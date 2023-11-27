package baseball.utils;

import org.mockito.internal.matchers.Null;

import static baseball.constvalue.ConstValue.*;

public class Validator {
    private static final String ERROR_MESSAGE = "[ERROR] 숫자가 잘못된 형식입니다";

    public void validateUserNumbers(String userNumbers) {
        if (isInvalidUserNumbersLength(userNumbers)) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }

    public void validateRestart(String restart) {
        if (isInvalidRestartLength(restart) || !isOneOrTwo(restart)) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }

    public void isNullOrEmpty(String input) {
        if (input == null){
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }

    public static void checkNumbersLength(String userNumbers) {
        if (userNumbers.length() != NUMBER_LENGTH) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }

    public static void checkNumbersRange(String userNumbers) {
        for (char userInput : userNumbers.toCharArray()){
            if (userInput < '1' || userInput > '9'){
                throw new IllegalArgumentException(ERROR_MESSAGE);
            }
        }
    }

    public static void isInvalidRestartLength(String restart) {
        if (restart.length() != RESTART_LENGTH) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }

    public static void isOneOrTwo(String restart) {
        return restart.equals(RESTART) || restart.equals(STOP);
    }
}
