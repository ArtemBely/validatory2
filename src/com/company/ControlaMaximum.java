package com.company;

public class ControlaMaximum extends Validator {

    private final int hodnota;
    private final int maximum = 10;

    public ControlaMaximum(int hodnota) {
        this.hodnota = hodnota;
    }

    @Override
    public boolean jeValidni() {
        return hodnota <= maximum;
    }

    @Override
    public void vypisChybu() {
        System.out.println("Zadaná hodnota (" + hodnota + ") vice nez maximalni " + maximum);
    }
}
