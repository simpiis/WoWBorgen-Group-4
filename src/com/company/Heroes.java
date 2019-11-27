package com.company;

public class Heroes {
    private int hp;
    private int damage;

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Heroes(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }
    public void rouge (){
        System.out.println("Rogues hp is: " + getHp());
        System.out.println("Rogues damage is: " + getDamage());
        //System.out.println("Rogues Special ability is: ");
    }
    public void warrior () {
        System.out.println("Warriors hp is: " + getHp());
        System.out.println("Warriors damage is: " + getDamage());
        //System.out.println("Warriors Special ability is: ");
    }
    public void mage () {
        System.out.println("Mages hp is: " + getHp());
        System.out.println("Mages damage is: " + getDamage());
        //System.out.println("Mages Special ability is: ");
    }
}
