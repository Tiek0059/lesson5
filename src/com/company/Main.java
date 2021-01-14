package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHp(700);
        boss.setDamage(50);
        boss.setDefenceType("Magical");
        System.out.println("Boss's health: " + boss.getBossHp() + ";\nBoss's damage:  " + boss.getDamage() +
                ";\nBoss's defence: " + boss.getDefenceType() + ".");
        for (com.company.Hero b : createHeroes()) {
            System.out.println("Hero - damage = " + b.getDamage() + "; health = " + b.getHeroHp() +
                    "; super ability " + b.getSuperAbility() + ".");
        }
    }

    public static com.company.Hero[] createHeroes() {
        com.company.Hero lucky = new com.company.Hero(100, 25, "lucky");
        com.company.Hero valkiriya = new com.company.Hero(120, 30, "aye damage");
        com.company.Hero mag = new com.company.Hero(70, 20, "magical");
        return new com.company.Hero[]{lucky, valkiriya, mag};

    }
}