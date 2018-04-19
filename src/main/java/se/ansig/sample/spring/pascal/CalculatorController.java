package se.ansig.sample.spring.pascal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/pascal/row")
    public PascalRow pascalRow(@RequestParam(value="n", defaultValue="1") Integer n) {
        return new PascalRow(Calculator.pascalRow(n));
    }
}
