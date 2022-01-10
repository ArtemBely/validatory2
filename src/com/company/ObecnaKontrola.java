package com.company;

public class ObecnaKontrola extends Validator {

    private final int hodnota;
    private final int maximum = 30;
    private final int minimum = 10;

    public ObecnaKontrola(int hodnota) {
        this.hodnota = hodnota;
    }

    @Override
    public boolean jeValidni() {
        if(hodnota < maximum && hodnota > minimum) {
            return true;
        }
        return false;
    }

    @Override
    public void vypisChybu() {
        System.out.println("Zadaná hodnota (" + hodnota + ") vice nez maximalni " + maximum + " nebo min nez minimalni " + minimum);
    }
}
