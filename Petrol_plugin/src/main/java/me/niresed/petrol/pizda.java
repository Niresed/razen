package me.niresed.petrol;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class pizda implements Listener {
    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("о ты проснулся");
    }
    @EventHandler
    public void onExpBottleEvent(ExpBottleEvent e) {
        e.setShowEffect(false);
    }
    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent e) {
        Player playerr = e.getPlayer();
        Entity entity = e.getEntity();
        if(entity.getType() == EntityType.SHEEP){
            playerr.sendMessage("это овца крч ты так не можешь, пон ?");
            e.setCancelled(true);
            playerr.setHealth(0);
        }else {
            playerr.sendMessage("лан это не овца");
        }
    }

}
