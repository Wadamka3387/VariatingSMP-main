package me.wadamka.exampleshit;

import me.wadamka.exampleshit.listener.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExampleShit extends JavaPlugin {

    public static ExampleShit plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic

        plugin = this;

        Bukkit.getServer().getPluginManager().registerEvents(new BlockBreak(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerSleepEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new CreeperExplodeEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new OnFallDamageEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerHitEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerEatEvent(), this);

    }

    public static ExampleShit getPlugin(){
        return plugin;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
