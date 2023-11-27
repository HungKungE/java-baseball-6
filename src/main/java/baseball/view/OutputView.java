package baseball.view;

public class OutputView {
    public static void result(int ball, int strike) {
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
