package com.example.user.cityattack;

import com.example.user.cityattack.kaijuPackage.KumaDesu;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 06/09/2017.
 */

public class KumaDesuTest {

    @Test
    public void testCanRoar(){
        KumaDesu kumadesu = new KumaDesu("Boris", 500, 70);
        assertEquals( "*Roars in bear*", kumadesu.roar() );
    }

    @Test
    public void testHasHealth(){
        KumaDesu kumadesu = new KumaDesu("Boris", 500, 70);
        assertEquals( 500, kumadesu.getHealthValue() );
    }

    @Test
    public void testCanAttack(){
        KumaDesu kumadesu = new KumaDesu("Boris", 500, 70);
        assertEquals( 70, kumadesu.getAttackValue());
    }

    @Test
    public void testHasName(){
        KumaDesu kumadesu = new KumaDesu("Boris", 500, 70);
        assertEquals( "Boris", kumadesu.getName());
    }
}
