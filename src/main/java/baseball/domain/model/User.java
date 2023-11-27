package baseball.domain.model;

import baseball.utils.Validator;
import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Integer> numbers;

    public User(String numbers){
        validate(numbers);
        convertInput(numbers);
    };

    public List<Integer> getNumbers() {
        return numbers;
    }

    private void validate(String numbers){
        Validator.checkNumbersLength(numbers);
        Validator.checkNumbersRange(numbers);
    }

    private void convertInput(String userInputs){
        List<Integer> numbers = new ArrayList<>();

        for (char userInput : userInputs.toCharArray()){
            numbers.add(Character.getNumericValue(userInput));
        }

        this.numbers = numbers;
    }
}
