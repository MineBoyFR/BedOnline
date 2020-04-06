package fr.mineboyfr.BedSurvie;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    /**
     * @autor : MineBoy
     */
    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents((Listener)new ClickBed(),this);
        System.out.println("-------------------");
        System.out.println("Plugin BedSurvie On");
        System.out.println("-------------------");
    }

    @Override
    public void onDisable() {
        System.out.println("--------------------");
        System.out.println("Plugin BedSurvie Off");
        System.out.println("--------------------");
    }
}
