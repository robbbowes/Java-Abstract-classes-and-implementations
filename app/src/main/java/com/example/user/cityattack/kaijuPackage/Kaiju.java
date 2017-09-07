package com.example.user.cityattack.kaijuPackage;

import com.example.user.cityattack.CanAttack;
import com.example.user.cityattack.Damageable;

/**
 * Created by user on 06/09/2017.
 */

public abstract class Kaiju implements Damageable, CanAttack {

    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public String roar(){
        return "Roar!!";
    }

    public void attack(Damageable damageable){
        damageable.takeDamage(this.attackValue);
    }

    public void takeDamage(int attackValue){
        healthValue -= attackValue;
    }

    public String move(){
        return this.name + " moves! HELL YEAH!";
    }

}
