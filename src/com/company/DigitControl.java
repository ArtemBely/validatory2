package com.company;

public class DigitControl extends Validator{

    private final String retezec2;

    public DigitControl(String retezec2) {
        this.retezec2 = retezec2;
    }

    @Override
    public boolean jeValidni() {
        int i;

        for (i=0; i<retezec2.length(); i++) {
            if(Character.isDigit(retezec2.charAt(i))) {
                System.out.println(retezec2 + " obsahuje cislo");
                return true;
            }
        }
        return false;
    }

    @Override
    public void vypisChybu() {
        System.out.println("Retezec (" + retezec2 + ") ne obsahuje cislo.");
    }
}
