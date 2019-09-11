package pl.bb.javastart.servlet;

public class Calc {

    String metersToCM (String me){
        double meters = Integer.valueOf(me);
        return String.valueOf(meters * 100);
    }
    String metersToMM (String me){
        double meters = Integer.valueOf(me);
        return String.valueOf(meters * 1000);
    }
    double centimetersToME (String cm){
        double centimeters = Integer.valueOf(cm);
        return centimeters / 100;
    }
    double centimetersToMM (String cm){
        double centimeters = Integer.valueOf(cm);
        return centimeters * 10;
    }
    double millimetersToME (String mm){
        double millimeters = Integer.valueOf(mm);
        return millimeters / 1000;
    }
    double millimetersToCM (String mm){
        double millimeters = Integer.valueOf(mm);
        return millimeters / 10;
    }
    double kilogramsToGR (String kg) {
        double kilograms = Integer.valueOf(kg);
        return kilograms * 100;
    }
    double kilogramsToMG (String kg) {
        double kilograms = Integer.valueOf(kg);
        return kilograms * 1000;
    }
    double gramToKG (String gr) {
        double grams = Integer.valueOf(gr);
        return grams / 100;
    }
    double gramToMG (String gr) {
        double grams = Integer.valueOf(gr);
        return grams * 10;
    }
    double miligramToKG (String mg) {
        double miligram = Integer.valueOf(mg);
        return miligram / 1000;
    }
    double miligramToGR (String mg) {
        double miligram = Integer.valueOf(mg);
        return miligram / 100;
    }
}
