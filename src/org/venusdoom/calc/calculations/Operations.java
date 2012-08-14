package org.venusdoom.calc.calculations;

public class Operations implements Calculations {

    @Override
    public double sum(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    @Override
    public double diff(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }

    @Override
    public double mult(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    @Override
    public double div(double firstValue, double secondValue) {
        return firstValue / secondValue;
    }
    

}

    


