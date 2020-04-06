package fr.mineboyfr.BedSurvie;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

/**
 * @autor : MineBoy
 * @deprecated : Envoie un msg autre joueur quand il se trouve dans un lit.
 */

public class ClickBed implements Listener {

    @EventHandler
    public void  PlayerBedEnterEvent(PlayerBedEnterEvent e){
        Player p = e.getPlayer();
        if (e.useBed() == e.useBed() && Bukkit.getOnlinePlayers().size() >= 2){
            p.sendMessage(  ChatColor.GOLD + p.getName()+ " Veut dormir");

        }
    }
}
