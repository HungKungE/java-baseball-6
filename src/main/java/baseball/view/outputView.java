package baseball.view;

import baseball.game.Score;
import baseball.utils.PrintUtils;
import baseball.utils.Validator;
import camp.nextstep.edu.missionutils.Console;

public class outputView {
    public void result(int ball, int strike) {
        String answer = "";

        if (ball>0){
            answer += ball + "볼 ";
        }

        if (strike>0){
            answer += strike + "스트라이크 ";
        }

        if (answer.isEmpty()){
            answer = "낫싱";
        }

        System.out.println(answer);
    }
}
