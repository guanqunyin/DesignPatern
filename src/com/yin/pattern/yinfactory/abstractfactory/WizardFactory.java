package com.yin.pattern.yinfactory.abstractfactory;

import com.yin.pattern.yinfactory.abstractfactory.wizard.Broom;
import com.yin.pattern.yinfactory.abstractfactory.wizard.MagicStick;
import com.yin.pattern.yinfactory.abstractfactory.wizard.Mushroom;

public class WizardFactory extends  AbstractFactory{


    @Override
    public Vihicle createVihicle() {
        return new Broom();
    }

    @Override
    public Food createFood() {
        return new Mushroom();
    }

    @Override
    public Weanpon createWeapon() {
        return new MagicStick();
    }
}
