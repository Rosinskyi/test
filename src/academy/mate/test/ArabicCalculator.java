package academy.mate.test;

public class ArabicCalculator extends Calculator {
    private String firstValue;
    private String symbol;
    private String secondValue;

    public ArabicCalculator(String firstValue, String symbol, String secondValue) {
        this.firstValue = firstValue;
        this.symbol = symbol;
        this.secondValue = secondValue;
        showResult();
    }

    private void showResult() {
        System.out.println("Result: " + calculate(Integer.valueOf(firstValue), symbol, Integer.valueOf(secondValue)));
    }

}
