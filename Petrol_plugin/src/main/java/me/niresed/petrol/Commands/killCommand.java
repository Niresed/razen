package me.niresed.petrol.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class killCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("die")){
            if(sender instanceof Player){
                Player player = (Player) sender;
                player.setHealth(0);
                player.sendMessage(ChatColor.RED + "you was died");
            }
        }
        return true;
    }

}
