package org.example;

public class HDMI extends Colokan{
    private double marketPrice = 50000;

    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth() {
        double ratio = getHarga() / marketPrice;
        if (ratio < 1) {
            return ratio * getPromisedBandwidth();
        } else {
            return getPromisedBandwidth();
        }
    }
}
