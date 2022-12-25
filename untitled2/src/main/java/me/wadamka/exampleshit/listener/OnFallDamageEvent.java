package me.wadamka.exampleshit.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffectType;

public class OnFallDamageEvent implements Listener {

    @EventHandler
    public static void onFallDamage(EntityDamageEvent event){

        if(event.getEntity() instanceof Player){
            Player p = ((Player) event.getEntity()).getPlayer();

            if(event.getCause() == EntityDamageEvent.DamageCause.FALL){
                p.addPotionEffect(PotionEffectType.LEVITATION.createEffect(10, 50));
            }
        }

    }

}
