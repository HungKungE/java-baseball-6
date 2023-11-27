package baseball.domain;

import baseball.utils.Validator;
import static baseball.constvalue.ConstValue.*;
public class Restart {
    private boolean restart;

    public Restart(){
        this.restart = true;
    }

    public boolean getRestart(){
        return restart;
    }

    public void setRestart(String restart){
        validate(restart);
        this.restart = restart.equals(RESTART);
    }

    private void validate(String restart){
        Validator.checkRestartLength(restart);
        Validator.checkRestartType(restart);
    }
}
