package se.ansig.sample.spring.pascal;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;

public class Calculator {

    /**
     * Calculate Nth row in pascal triangle.
     *
     * @param n the row to calculate
     * @return a list of integers
     */
    public static List<Integer> pascalRow(int n) {
        if (n == 1) {
            return asList(1);
        } else {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> previousLine = pascalRow(n - 1);
            for (int i = 0; i < previousLine.size() - 1; i++) {
                row.add(previousLine.get(i) + previousLine.get(i+1));
            }
            row.add(1);
            return row;
        }
    }

}
