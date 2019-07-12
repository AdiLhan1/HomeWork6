package com.company;

public class Mental extends Player {
    private int kineticHit;
    public Mental(int health, int hit) {
        super.setHealth(health);
        super.setHit(hit);
    }

    public void printInfo() {
        System.out.println(super.getHealth() + ";" + super.getHit() + "- Критический урон дает + " + getKineticHit()+" урона");
    }

    public int getKineticHit() {
        return kineticHit;
    }

    public void setKineticHit(int kineticHit) {
        this.kineticHit = kineticHit;
    }

    public void kineticHit() {
        super.setHit(super.getHit()+kineticHit);
    }

    @Override
    public void sayWord() {
        System.out.println("YEAHHHHHHH");
    }
}