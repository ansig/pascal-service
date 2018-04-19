package se.ansig.sample.spring.pascal;

import java.util.List;

public class PascalRow {

    private final List<Integer> numbers;

    public PascalRow(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
