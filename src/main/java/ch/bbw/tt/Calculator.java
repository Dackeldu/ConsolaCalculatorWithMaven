package ch.bbw.tt;

public class Calculator {
    int countOfCalculations = 0;
    public int summe(int summand1, int summand2) {
        return summand1 + summand2;
    }

    public int subtraction(int value1, int value2) {
        return value1 - value2;
    }

    public int divide(int value1, int value2) {return  value1 / value2;}

    public int getCountOfCalculations() {
        return countOfCalculations;
    }

    public void setCountOfCalculations(int countOfCalculations) {
        this.countOfCalculations = countOfCalculations;
    }
}
