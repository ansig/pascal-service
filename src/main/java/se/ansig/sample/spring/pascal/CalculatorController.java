package se.ansig.sample.spring.pascal;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @RequestMapping(value = "/pascal/row/{n}", method = RequestMethod.GET)
    public PascalRow pascalRow(@PathVariable Integer n) {
        return new PascalRow(Calculator.pascalRow(n));
    }
}
