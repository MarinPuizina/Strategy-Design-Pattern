package main.java.strategyPattern.RPG;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void attack() {
        System.out.println("Sword attack!");
    }

}
