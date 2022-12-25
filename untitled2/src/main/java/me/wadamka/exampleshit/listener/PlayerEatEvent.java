package me.wadamka.exampleshit.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffectType;

public class PlayerEatEvent implements Listener {

    @EventHandler
    public static void onPlayerEat(PlayerItemConsumeEvent event){

        Player p = event.getPlayer();

        p.addPotionEffect(PotionEffectType.CONFUSION.createEffect(2 * 20, 10));
        p.addPotionEffect(PotionEffectType.BLINDNESS.createEffect(2 * 20, 255));

    }

}
