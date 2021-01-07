package com.company;

public class Hero {
    private int Health,Damage;
    private String superPower;

    public Hero(){

    }

    public Hero(int health, int damage, String superPower) {
        this.Health = health;
        this.Damage = damage;
        this.superPower = superPower;
    }

    public Hero(int health, int damage) {
        this.Health = health;
        this.Damage = damage;
    }


    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public String getSuperPower() {
        return superPower;
    }

}
