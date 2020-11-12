package ua.edu.ucu.tempseries;

import java.util.InputMismatchException;

public class TemperatureSeriesAnalysis {

    private double [] temperatures = new double[0];
    private int tempLength;

    public TemperatureSeriesAnalysis() {

    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        if (checkTemperature(temperatureSeries)){
            this.temperatures = temperatureSeries;
        }
        else {
            throw new InputMismatchException();
        }
        this.tempLength = temperatures.length;
    }

    public boolean checkTemperature(double []temps){
        for (int i=0; i<temps.length; i++){
            if (temps[i] < -273){
                return false;
            }
        }
        return true;
    }

    public double average(){
        if (temperatures.length != 0) {
            double sum = 0.0;

            for (double temp: temperatures) {
                sum += temp;
            }

            double average = sum / temperatures.length;
            return average;
        }
        throw new IllegalArgumentException();
    }

    public double deviation() {
        if (temperatures.length != 0) {
            double sum = 0.0, deviation = 0.0;

            for (double num : temperatures) {
                sum += num;
            }
            double mean = sum / temperatures.length;

            for (double num : temperatures) {
                deviation += Math.pow(num - mean, 2);
            }
            return Math.sqrt(deviation / temperatures.length);
        }
        throw new IllegalArgumentException();
    }

    public double min() {
        if (temperatures.length != 0){
            double min = Double.POSITIVE_INFINITY;
            for(double num: temperatures){
                if (num < min){
                    min = num;
                }
            }
            return min;
        }
        throw new IllegalArgumentException();
    }

    public double max() {
        if (temperatures.length != 0){
            double max = Double.NEGATIVE_INFINITY;
            for(double num: temperatures){
                if (num > max){
                    max = num;
                }
            }
            return max;
        }
        throw new IllegalArgumentException();
    }

    public double findTempClosestToZero() {
        if (temperatures.length != 0) {
            double closest = Double.POSITIVE_INFINITY;
            for (double num : temperatures) {
                if (Math.abs(num) < closest) {
                    closest = num;
                }
                else if (num == Math.abs(closest)) {
                    closest = num;
                }
            }
            return closest;
        }
        throw new IllegalArgumentException();
    }

    public double findTempClosestToValue(double tempValue) {
        if (temperatures.length != 0) {
            double closestToValue = Double.POSITIVE_INFINITY;
            for (double num : temperatures) {
                if (Math.abs(tempValue - num) <
                        Math.abs(tempValue - closestToValue)) {
                    closestToValue = num;
                } else if (Math.abs(tempValue - num) ==
                        Math.abs(tempValue - closestToValue)) {
                    closestToValue = Math.abs(Math.abs(tempValue - num));
                }
            }
            return closestToValue;
        }
        throw new IllegalArgumentException();
    }

    public double[] findTempsLessThen(double tempValue) {
        int counter = 0;
        for (double num : temperatures) {
            if (num < tempValue){
                counter += 1;
            }
        }
        int counter2 = 0;
        double[] lessValues = new double[counter];
        for (double num : temperatures) {
            if (num < tempValue){
                lessValues[counter2] = num;
                counter2 += 1;
            }
        }
        return lessValues;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        int counter = 0;
        for (double num : temperatures) {
            if (num > tempValue){
                counter += 1;
            }
        }
        int counter2 = 0;
        double[] greaterValues = new double[counter];
        for (double num : temperatures) {
            if (num > tempValue){
                greaterValues[counter2] = num;
                counter2 += 1;
            }
        }
        return greaterValues;
    }

    public TempSummaryStatistics summaryStatistics() {
        double average = this.average();
        double devTemp = this.deviation();
        double min = this.min();
        double max = this.max();
        TempSummaryStatistics statistics = new
                TempSummaryStatistics(average, devTemp, min, max);
        return statistics;
    }

    public int addTemps(double... temps) {
        int lengthNewArray = this.tempLength;
        if (this.tempLength == 0){
            lengthNewArray = 1;
        }
        while (lengthNewArray < this.tempLength + temps.length){
            lengthNewArray *= 2;
        }
        double[] newArray = new double[lengthNewArray];
        int counter = 0;
        for (int i=0; i<tempLength; i++){
            newArray[counter] = temperatures[i];
            counter += 1;
        }
        for (int j=0; j<temps.length; j++){
            newArray[counter] = temps[j];
            counter += 1;
        }
        return counter;
    }
}

