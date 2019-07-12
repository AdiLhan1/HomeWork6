package com.company;

public class Magical extends Player {
    private int magicalHit;

    public Magical(int health, int hit) {
        super.setHealth(health);
        super.setHit(hit);
    }

    public void printInfo() {
        System.out.println(super.getHealth() + ";" + super.getHit() + "- Критический урон дает + " + getMagicalHit()+" урона.");
    }

    public int getMagicalHit() {
        return magicalHit;
    }

    public void setMagicalHit(int magicalHit) {
        this.magicalHit = magicalHit;
    }

    public void magicalHit() {
        super.setHit(super.getHit()+magicalHit);
    }

    @Override
    public void sayWord() {
        System.out.println("Fokus Pokus!");
    }
}
