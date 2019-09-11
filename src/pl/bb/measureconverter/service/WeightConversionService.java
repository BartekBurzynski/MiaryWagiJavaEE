package pl.bb.measureconverter.service;

public class WeightConversionService {

    public double kilogramsToGR(String kg) {
        double kilograms = Integer.valueOf(kg);
        return kilograms * 100;
    }

    public double kilogramsToMG(String kg) {
        double kilograms = Integer.valueOf(kg);
        return kilograms * 1000;
    }

    public double gramToKG(String gr) {
        double grams = Integer.valueOf(gr);
        return grams / 100;
    }

    public double gramToMG(String gr) {
        double grams = Integer.valueOf(gr);
        return grams * 10;
    }

    public double miligramToKG(String mg) {
        double miligram = Integer.valueOf(mg);
        return miligram / 1000;
    }

    public double miligramToGR(String mg) {
        double miligram = Integer.valueOf(mg);
        return miligram / 100;
    }
}
