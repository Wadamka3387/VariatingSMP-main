package me.wadamka.exampleshit.listener;

import me.wadamka.exampleshit.storage.PlayerWeakness;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerHitEvent implements Listener {

    @EventHandler
    public static void onPlayerHit(EntityDamageByEntityEvent event){

        if(event.getDamager() instanceof  Player){

            Player p = (Player) event.getDamager();

            PlayerWeakness.setWeakness(p, +1);

            if(PlayerWeakness.hasWeakness(p)){

                PlayerWeakness.setWeakness(p, +1);
                System.out.println(PlayerWeakness.getWeakness(p));

            } else if (!PlayerWeakness.hasWeakness(p)) {
                PlayerWeakness.setWeakness(p, 1);
            }
        }



    }

}
