package pl.bb.measureconverter.service;

public class MeasureConversionService {

    public String metersToCM(String me) {
        double meters = Integer.valueOf(me);
        return String.valueOf(meters * 100);
    }

    public String metersToMM(String me) {
        double meters = Integer.valueOf(me);
        return String.valueOf(meters * 1000);
    }

    public double centimetersToME(String cm) {
        double centimeters = Integer.valueOf(cm);
        return centimeters / 100;
    }

    public double centimetersToMM(String cm) {
        double centimeters = Integer.valueOf(cm);
        return centimeters * 10;
    }

    public double millimetersToME(String mm) {
        double millimeters = Integer.valueOf(mm);
        return millimeters / 1000;
    }

    public double millimetersToCM(String mm) {
        double millimeters = Integer.valueOf(mm);
        return millimeters / 10;
    }
}
