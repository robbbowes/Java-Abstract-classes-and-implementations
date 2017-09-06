package com.example.user.cityattack.vehiclesPackage;

import com.example.user.cityattack.CanAttack;
import com.example.user.cityattack.Damageable;

/**
 * Created by user on 06/09/2017.
 */

public class TankuDesu extends Vehicle implements CanAttack, Damageable{

    public TankuDesu(String type, int healthValue, int attackValue){
        super(type, healthValue, attackValue);
    }

}
