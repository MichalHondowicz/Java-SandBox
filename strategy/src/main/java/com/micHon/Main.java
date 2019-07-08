package com.micHon;

import com.micHon.chef.Chef;
import com.micHon.eggCooker.HardBoiledEggCooker;
import com.micHon.eggCooker.SoftBoiledEggCooker;

public class Main {

    public static void main(String[] args) {

        Chef chef = new Chef("Pascal");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }
}
