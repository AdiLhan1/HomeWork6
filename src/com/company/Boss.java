package com.company;
import java.util.Random;

public class Boss extends Player {
    private int defence;

    public Boss(int health, int hit) {
        super.setHealth(health);
        super.setHit(hit);
        changeBossDefence();
    }

    public void printInfo() {
        System.out.println(super.getHealth() + ";" + super.getHit() + "- Тип защиты босса : " + getDefence());
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void changeBossDefence() {
        Random r = new Random();
        int randomNum = r.nextInt(3) + 1;
        setDefence(randomNum);

    }

    @Override
    public void sayWord() {
        System.out.println("Bugagaga!");
    }
}