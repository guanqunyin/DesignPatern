package com.yin.pattern.yinfactory.abstractfactory;

import com.yin.pattern.yinfactory.abstractfactory.NormalHuman.Ak47;
import com.yin.pattern.yinfactory.abstractfactory.NormalHuman.Bread;
import com.yin.pattern.yinfactory.abstractfactory.NormalHuman.Car;

public class MuggleFactory extends AbstractFactory{
    @Override
    Vihicle createVihicle() {
        return new Car();
    }

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Weanpon createWeapon() {
        return new Ak47();
    }
}
