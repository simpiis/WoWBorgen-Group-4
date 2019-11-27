package com.company;

public class Heroes {
    private int hp;
    private int damage;

    public void rouge (){
        hp = 110;
        damage = 15;
        System.out.println("Rogues hp is: " + hp);
        System.out.println("Rogues damage is: " + damage);
        //System.out.println("Rogues Special ability is: ");
    }
    public void warrior () {
        hp = 90;
        damage = 30;
        System.out.println("Warriors hp is: " + hp);
        System.out.println("Warriors damage is: " + damage);
        //System.out.println("Warriors Special ability is: ");
    }
    public void mage () {
        hp = 100;
        damage = 20;
        System.out.println("Mages hp is: " + hp);
        System.out.println("Mages damage is: " + damage);
        //System.out.println("Mages Special ability is: ");
    }
}
