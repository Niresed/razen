package me.niresed.petrol;

import me.niresed.petrol.Commands.killCommand;
import me.niresed.petrol.Commands.topCommand;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Petrol extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello world");
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new pizda(), this);
        getServer().getPluginManager().registerEvents(new Hello(), this);
        getServer().getPluginManager().registerEvents(new Bye(), this);
        getCommand("die").setExecutor(new killCommand());
        getCommand("gm4").setExecutor(new topCommand());
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
