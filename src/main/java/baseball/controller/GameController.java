package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.Restart;
import baseball.domain.Score;
import baseball.domain.User;
import baseball.utils.PrintUtils;

import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;
import static baseball.constvalue.ConstValue.*;

public class GameController {
    private final Computer computer;
    private final Score score;
    private final User user;
    private final Restart restart;

    private final PrintUtils printUtil = new PrintUtils();

    public GameController(){
        this.computer = new Computer();
        this.user = new User();
        this.score = new Score();
        this.restart = new Restart();
    }

    public void play(){
        printUtil.printStartGame();

        while (restart.getRestart()) {
            user.setNumbers(InputView.userNumbers());

            compare();

            if (score.isThreeStrike()){
                printUtil.printEnd();
                restart.setRestart(InputView.gameRestart());
                if (restart.getRestart()){
                    computer.generateNewNumbers();
                }
            }

            score.resetScore();
        }
    }

    private void compare(){
        List<Integer> com = computer.getNumbers();
        List<Integer> usr = user.getNumbers();

        for (int i=0;i<NUMBER_LENGTH;i++){
            if(usr.get(i).equals(com.get(i))) {
                score.addStrike();
            } else if(com.contains(usr.get(i))){
                score.addBall();
            }
        }
        OutputView.result(score.getBall(), score.getStrike());
    }

}
