package me.wadamka.exampleshit.storage;

import me.wadamka.exampleshit.ExampleShit;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.Nullable;

public class PlayerWeakness implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event){
        Player p = event.getPlayer();

        PersistentDataContainer data = p.getPersistentDataContainer();
        NamespacedKey weakness = new NamespacedKey(ExampleShit.getPlugin(), "weakness");

        setWeakness(p, 0);

    }

    public static @Nullable Integer getWeakness(Player p){

        PersistentDataContainer data = p.getPersistentDataContainer();
        NamespacedKey weakness = new NamespacedKey(ExampleShit.getPlugin(), "weakness");

        return data.get(weakness, PersistentDataType.INTEGER);

    }

    public static void setWeakness(Player p, Integer level){

        PersistentDataContainer data = p.getPersistentDataContainer();
        NamespacedKey weakness = new NamespacedKey(ExampleShit.getPlugin(), "weakness");

        data.set(weakness, PersistentDataType.INTEGER, level);
        p.addPotionEffect(PotionEffectType.WEAKNESS.createEffect(10 * 20, level));

    }


    public static boolean hasWeakness(Player p){

        PersistentDataContainer data = p.getPersistentDataContainer();
        NamespacedKey weakness = new NamespacedKey(ExampleShit.getPlugin(), "weakness");

        return data.has(weakness);

    }


}
