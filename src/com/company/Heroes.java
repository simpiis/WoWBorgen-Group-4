package com.company;

public class Heroes extends Creature {

    public Heroes(int hp, int damage) {
        super(hp, damage);
    }
    public void rogue() {
        System.out.print("Rogues hp is: ");
        System.out.println(getHp());
        System.out.print("Rogues damage is: ");
        System.out.println(getDamage());
    }

}
