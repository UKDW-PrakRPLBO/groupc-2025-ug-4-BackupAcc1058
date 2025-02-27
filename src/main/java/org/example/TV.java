package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public String getResolution() {
        if (colokan.getRealBandwidth() < 10) {
            return 0 + "";
        } else if (colokan.getRealBandwidth() <= 35) {
            return 480 + "";
        } else if (colokan.getRealBandwidth() <= 100) {
            return 720 + "";
        } else {
            return 1080 + "";
        }
    }

    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }
}
