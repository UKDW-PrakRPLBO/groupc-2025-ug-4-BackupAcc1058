package org.example;

public class VGA extends Colokan{
    private double marketPrice = 30000;

    public VGA(int harga, double promisedBandwidth, String merk) {
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
