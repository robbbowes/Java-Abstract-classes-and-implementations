package com.example.user.cityattack;

import com.example.user.cityattack.kaijuPackage.SaamonDesu;
import com.example.user.cityattack.vehiclesPackage.TankuDesu;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 06/09/2017.
 */

public class SaamonDesuTest {

    @Test
    public void testCanRoar(){
        SaamonDesu saamondesu = new SaamonDesu("Sammy", 300, 25);
        assertEquals( "SAAMONU_DES!!", saamondesu.roar() );
    }

    @Test
    public void testHasHealth(){
        SaamonDesu saamondesu = new SaamonDesu("Sammy", 300, 25);
        assertEquals( 300, saamondesu.getHealthValue() );
    }

    @Test
    public void testCanAttack(){
        SaamonDesu saamondesu = new SaamonDesu("Sammy", 300, 25);
        assertEquals( 25, saamondesu.getAttackValue());
    }

    @Test
    public void testHasName(){
        SaamonDesu saamondesu = new SaamonDesu("Sammy", 300, 25);
        assertEquals( "Sammy", saamondesu.getName());
    }

    @Test
    public void testCanCauseDamage(){
        SaamonDesu saamondesu = new SaamonDesu("Sammy", 300, 25);
        TankuDesu tankudesu = new TankuDesu("Thomas", 50, 10);
        saamondesu.attack((Damageable) tankudesu);
        assertEquals( 25, tankudesu.getHealthValue());
    }

    @Test
    public void testCanMove(){
        SaamonDesu saamondesu = new SaamonDesu("Sammy", 300, 25);
        assertEquals( "Sammy moves! Eek!", saamondesu.move());
    }
}