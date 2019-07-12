package com.company;

public class Main {

    public static void main(String[] args) {
        Boss Bugaga = new Boss(500, 50);
        Bugaga.sayWord();
        Bugaga.changeBossDefence();
        Bugaga.printInfo();

        Warrior soldier = new Warrior(250, 20);
        Magical petya = new Magical(250, 20);
        Mental kolya = new Mental(250, 20);

        int num = Bugaga.getDefence();
        switch (num) {
            case 1:
                soldier.setPhysicalHit(10);
                soldier.psyhicalHit();
                break;
            case 2:
                petya.setMagicalHit(20);
                petya.magicalHit();
                break;
            case 3:
                kolya.setKineticHit(40);
                kolya.kineticHit();
                break;
            default:
                break;

        }

        soldier.sayWord();
        soldier.printInfo();


        petya.sayWord();
        petya.printInfo();


        kolya.sayWord();
        kolya.printInfo();

    }
}