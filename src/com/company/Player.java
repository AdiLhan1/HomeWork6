package com.company;

public abstract class Player {
    private int health;
    private int hit;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public abstract void sayWord();
    public abstract void printInfo();
}