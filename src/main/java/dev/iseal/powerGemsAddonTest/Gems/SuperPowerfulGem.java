package dev.iseal.powerGemsAddonTest.Gems;

import dev.iseal.powergems.misc.AbstractClasses.Gem;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

public class SuperPowerfulGem extends Gem {

    public SuperPowerfulGem() {
        super("SuperPowerful");
    }

    @Override
    protected void rightClick(Player player) {
        System.out.println("SuperPowerfulGem right clicked");
    }

    @Override
    protected void leftClick(Player player) {
        System.out.println("SuperPowerfulGem left clicked");
    }

    @Override
    protected void shiftClick(Player player) {
        System.out.println("SuperPowerfulGem shift clicked");
    }

    @Override
    public Particle particle() {
        return Particle.ASH;
    }

}
