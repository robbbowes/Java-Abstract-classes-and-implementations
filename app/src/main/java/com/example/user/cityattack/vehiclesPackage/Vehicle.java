package com.example.user.cityattack.vehiclesPackage;

import com.example.user.cityattack.CanAttack;
import com.example.user.cityattack.Damageable;

/**
 * Created by user on 06/09/2017.
 */

public abstract class Vehicle implements CanAttack, Damageable{
    String type;
    int healthValue;
    int attackValue;

    public Vehicle(String type, int healthValue, int attackValue){
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public Vehicle(String type, int healthValue){
        this.type = type;
        this.healthValue = healthValue;
    }

    public void attack(Damageable damageable){
        damageable.takeDamage(this.attackValue);
    }

    public void takeDamage(int attackValue){
        healthValue -= attackValue;
    }
}
