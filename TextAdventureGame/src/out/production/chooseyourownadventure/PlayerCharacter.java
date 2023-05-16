package com.techelevator.chooseyourownadventure.out.production.chooseyourownadventure;

public class PlayerCharacter {

    // Member Variables
    private String name;
    private int health;
    private int stamina;
    private int credits;

    // Constructor
    public PlayerCharacter (String name, int health, int stamina, int credits){
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.credits = credits;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
