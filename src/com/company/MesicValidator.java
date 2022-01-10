package com.company;

public class MesicValidator extends Validator {
    private final int hodnota;

    public MesicValidator(int hodnota) {
        this.hodnota = hodnota;
    }

    @Override
    public boolean jeValidni() {
        return hodnota >= 1 && hodnota <= 12;
    }

    @Override
    public void vypisChybu() {
        System.out.println("Zadaná hodnota (" + hodnota + ") není mezi 1 až 12!");
    }
}
