package academy.mate.test;

public class Calculator {


    public int calculate(int firstValue, String symbol, int secondValue) {
        int result = 0;

        switch (symbol) {
        case "+":
            result = firstValue + secondValue;

            return result;
        case "-":
            result = firstValue - secondValue;

            return result;
        case "/":
            if (secondValue == 0) {

                return result;

            } else {
                result = firstValue / secondValue;

                return result;
            }

        case "*":
            result = firstValue * secondValue;

            return result;
        }

        return result;
    }
}
