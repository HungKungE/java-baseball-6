package baseball.domain;

import baseball.utils.Validator;
import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Integer> numbers;

    public User(){
        this.numbers = new ArrayList<>();
    };

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers){
        validate(numbers);
        convertInput(numbers);
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
