package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(1000);
        boss.setBossDamage(100);
        boss.setBossDefenceType("Magical");
        System.out.println("Boss health:" + boss.getBossHealth() + "  Boss damage:" + boss.getBossDamage() + "  Boss defence type:" + boss.getBossDefenceType());

        Hero hero = new Hero();
        Hero[] heroes;
        heroes = createHeroes();
        for (int i = 0; i < 3; i++) {
            System.out.println("Hero health:" + heroes[i].getHealth() + " Hero damage:" + heroes[i].getDamage() + " Hero Super power:" + heroes[i].getSuperPower());
        }

    }

    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(350,20,"Kinetic");
        Hero hero2 = new Hero(400,25);
        Hero hero3 = new Hero(300,30);

        Hero[] array1 = {hero1,hero2,hero3};
        return array1;

    }


}
