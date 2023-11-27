package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Integer> numbers;

    public Computer(){
        generateNewNumbers();
    };

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void generateNewNumbers(){
        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);

            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }

        this.numbers = numbers;
    }
}