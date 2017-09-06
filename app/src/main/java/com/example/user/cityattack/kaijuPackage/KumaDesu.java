package com.example.user.cityattack.kaijuPackage;

import com.example.user.cityattack.CanAttack;
import com.example.user.cityattack.Damageable;

/**
 * Created by user on 06/09/2017.
 */

public class KumaDesu extends Kaiju{

    public KumaDesu(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return "*Roars in bear*";
    }

}
