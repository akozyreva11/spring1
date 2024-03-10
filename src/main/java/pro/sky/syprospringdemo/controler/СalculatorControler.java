package pro.sky.syprospringdemo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.syprospringdemo.service.CalculatorService;
import pro.sky.syprospringdemo.service.CalculatorServiceImpl;

import java.sql.SQLOutput;

@RestController
@RequestMapping(path = "/calculator")
public class СalculatorControler {

    public СalculatorControler(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    private final CalculatorService calculatorService;

    @GetMapping(path = "")

    public String answerCalculator() {
        return "Добро пожаловать  в калькулятор";
    }

    //http://localhost:8080/calculator/plus?num1=5&num2=7
    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam int num1, @RequestParam int num2) {
        return String.valueOf(calculatorService.plusCalculator(num1, num2));
    }

    //http://localhost:8080/calculator/plus?num1=7&num2=7
    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam int num1, @RequestParam int num2) {
        return String.valueOf(calculatorService.minusCalculator(num1, num2));
    }

    //http://localhost:8080/calculator/multiply?num1=7&num2=7
    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam int num1, @RequestParam int num2) {
        return String.valueOf(calculatorService.multiplyCalculator(num1, num2));

    }

    // http://localhost:8080/calculator/divide?num1=9&num2=9
    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam int num1, int num2) {
        if (num2 == 0) {
            return "На 0 ,делить нельзя";
        }
        return String.valueOf(calculatorService.divideCalculator(num1, num2));

    }
}