package me.wadamka.exampleshit.listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {

    @EventHandler
    public static void onBlockBreak(BlockBreakEvent event){

        Player p = event.getPlayer();

        Material matBlock = event.getBlock().getType();

        Block block = event.getBlock();
        World world = p.getWorld();

        if(matBlock == Material.DIAMOND_ORE || matBlock == Material.DEEPSLATE_DIAMOND_ORE){
            event.setCancelled(true);
            p.sendMessage(ChatColor.RED + "Hehehehaw");
            p.playSound(p.getLocation() ,Sound.ENTITY_CREEPER_PRIMED, 500f, 1f);
            block.setType(Material.DIRT);
            world.createExplosion(block.getLocation(), 20, false, true);
        }


    }

}
