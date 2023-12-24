package org.example.domain;

public final class Semitrailer extends Truck {

    private boolean isSemitrailerWithRails;

    public Semitrailer(boolean isSemitrailerWithRails) {
        this.isSemitrailerWithRails = isSemitrailerWithRails;
    }

    public boolean isSemitrailerWithRails() {
        return isSemitrailerWithRails;
    }

    public void setSemitrailerWithRails(boolean semitrailerWithRails) {
        isSemitrailerWithRails = semitrailerWithRails;
    }
}
