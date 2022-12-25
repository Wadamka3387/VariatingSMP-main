package me.wadamka.exampleshit.listener;

import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.potion.PotionEffectType;


public class PlayerSleepEvent implements Listener {

    @EventHandler
    public static void onPlayerSleep(PlayerBedEnterEvent event){

        Player p = event.getPlayer();
        World world = p.getWorld();

        world.spawnEntity(p.getLocation(), EntityType.CREEPER, false);
        p.addPotionEffect(PotionEffectType.BLINDNESS.createEffect(30, 200));
        p.addPotionEffect(PotionEffectType.SLOW.createEffect(30, 10));

    }

}
