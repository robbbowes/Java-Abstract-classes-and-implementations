package com.example.user.cityattack.kaijuPackage;

import com.example.user.cityattack.CanAttack;
import com.example.user.cityattack.Damageable;

/**
 * Created by user on 06/09/2017.
 */

public class SaamonDesu extends Kaiju{

    public SaamonDesu(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return "SAAMONU_DES!!";
    }

}
