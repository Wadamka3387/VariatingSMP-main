package me.wadamka.exampleshit.listener;

import com.destroystokyo.paper.event.entity.CreeperIgniteEvent;
import org.bukkit.World;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreeperPowerEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

public class CreeperExplodeEvent implements Listener {

    @EventHandler
    public static void onCreeperExplosion(EntityExplodeEvent event){

            event.setCancelled(true);

            World world = event.getEntity().getWorld();

            world.createExplosion(event.getLocation(), 30, true, true);


    }

}
