package academy.mate.test;

public class RomanCalculator extends Calculator {
    private String firstValue;
    private String symbol;
    private String secondValue;

    public RomanCalculator(String firstValue, String symbol, String secondValue) {
        this.firstValue = firstValue;
        this.symbol = symbol;
        this.secondValue = secondValue;
        showResult();
    }

    private int letterToNumber(String letter) {

        switch (letter) {
        case "I":
            return 1;
        case "II":
            return 2;
        case "III":
            return 3;
        case "IV":
            return 4;
        case "V":
            return 5;
        case "VI":
            return 6;
        case "VII":
            return 7;
        case "VIII":
            return 8;
        case "IX":
            return 9;
        case "X":
            return 10;
        default:
            return 1;
        }
    }

    private String numberToLetter(int number) {

        switch (number) {
        case 1:
            return "I";
        case 2:
            return "II";
        case 3:
            return "III";
        case 4:
            return "IV";
        case 5:
            return "V";
        case 6:
            return "VI";
        case 7:
            return "VII";
        case 8:
            return "VIII";
        case 9:
            return "IX";
        case 10:
            return "X";
        default:
            return "";
        }
    }

    private void showResult() {
        System.out.println("Result: "
                + numberToLetter(calculate(letterToNumber(firstValue), symbol, letterToNumber(secondValue))));
    }

}
