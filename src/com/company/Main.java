package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Zadejte heslo ktere obsahuje cislo: ");
        String digitControl = vstup.nextLine();

        System.out.print("Zadejte věk: ");
        int vek = vstup.nextInt();

        System.out.print("Zadejte měsíc: ");
        int mesic = vstup.nextInt();
        vstup.nextLine();
        System.out.print("Zadejte heslo: ");
        String heslo = vstup.nextLine();

        System.out.print("Zadejte hodnotu min nez 10: ");
        int hodnota = vstup.nextInt();

        System.out.print("Zadejte hodnotu min nez 30 a vice nez 10: ");
        int hodnotaMezi = vstup.nextInt();

        Validator[] validatory = {
                new DigitControl(digitControl),
                new KladnyValidator(vek),
                new MesicValidator(mesic),
                new RetezecDelsiNezValidator(heslo, 5),
                new ControlaMaximum(hodnota),
                new ObecnaKontrola(hodnotaMezi),
        };

//        for (int i = 0; i < validatory.length; i++) {
//            if (!validatory[i].jeValidni()) {
//                validatory[i].vypisChybu();
//            }
//        }

        for (Validator aktualniValidator : validatory) {
            if (!aktualniValidator.jeValidni()) {
                aktualniValidator.vypisChybu();
            }
        }

        // vytvořte další validátory, které budou také dědit od třídy Validator
        // a implementují jejich abstraktní metody
        // zařaďte je do načítání vstupů a do pole validátorů
        // (případně přidjte načítání dalších vstupů, pokud to bude potřeba)
        // 1) validátor na kontrolu, zda je číslo menší než maximální hodnota
        // 2) validátor na obecnou kontrolu, za je hodnta mezi dvěma zadanými hodnotami
        // 3) validátor, zda řetězec obsahuje číslo
        //     - nutné projít řetězec po znacích
        //     - a pokud bude obsahovat na nějakém znaku číslo, tak skončit a dát true
        //     - použijte statickou metodu Character.isDigit()
        /*String p = "ahoj123";
        for (int i = 0; i < p.length(); i++) {
            if (Character.isDigit(p.charAt(i))) {
                System.out.println("jo!");
            }
        }*/

//        KladnyValidator kladnyVekValidator = ;
//        if (!kladnyVekValidator.jeValidni()) {
//            kladnyVekValidator.vypisChybu();
//        }
//
//        MesicValidator mesicValidator = ;
//        if (!mesicValidator.jeValidni()) {
//            mesicValidator.vypisChybu();
//        }
//
//        RetezecDelsiNezValidator delkaHesla = new RetezecDelsiNezValidator(heslo, 5);
//        if (!delkaHesla.jeValidni()) {
//            delkaHesla.vypisChybu();
//        }
    }
}
