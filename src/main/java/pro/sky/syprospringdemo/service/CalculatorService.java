package pro.sky.syprospringdemo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceImpl {

    @Override
    //http://localhost:8080/calculator/plus?num1=5&num2=7
    public int plusCalculator(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    //http://localhost:8080/calculator/plus?num1=7&num2=7
    public int minusCalculator(int num1, int num2) {
        return num2 - num1;
    }

    @Override
    //http://localhost:8080/calculator/multiply?num1=7&num2=7
    public int multiplyCalculator(int num1, int num2) {
        return num2 * num1;
    }

    @Override
    // http://localhost:8080/calculator/divide?num1=9&num2=9
    public int divideCalculator(int num1, int num2) {
        return num1 / num2;
    }
}
