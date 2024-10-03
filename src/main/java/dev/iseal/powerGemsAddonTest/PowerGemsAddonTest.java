package dev.iseal.powerGemsAddonTest;

import dev.iseal.powerGemsAddonTest.Gems.SuperPowerfulGem;
import dev.iseal.powergems.api.ApiManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class PowerGemsAddonTest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        boolean success = ApiManager.getInstance().registerGemClass(SuperPowerfulGem.class);
        if (success)
            getLogger().info("Successfully registered SuperPowerfulGem");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
