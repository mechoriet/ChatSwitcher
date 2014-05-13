package me.thijs_a.chatswitcher;


import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Main extends JavaPlugin implements Listener{
	
	
	public void onEnable(){
		getLogger().info("ChatSwitcher is enabled!");
        PluginManager plm = this.getServer().getPluginManager();
        plm.registerEvents(this, this);
        this.saveDefaultConfig();
	}
	
	
	
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void PlayerChatEvent(org.bukkit.event.player.PlayerChatEvent e){
		Player player = e.getPlayer();
		 if(this.getConfig().getBoolean("chat") == false) {
			 if(player.hasPermission("sc.admin")){
				 
			 } else {
				 e.setCancelled(true);
				 
				 player.sendMessage(ChatColor.RED + "The chat is only avaible for admins");
			 }
			 
		 }
		 if(this.getConfig().getBoolean("chat") == true){
			 
		 }
		 else{
			 
		 }
		 
		 
		
	}
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event){
		Player p = event.getPlayer();
		String message = event.getMessage();
		PermissionUser user = PermissionsEx.getUser(p);
		 if (event.getMessage().startsWith("!")) {
			 if(this.getConfig().getBoolean("chat") == false){
				 
				 p.sendMessage(ChatColor.RED + "Global Chat is disabled!");
				 event.setCancelled(true);
			 } else if(this.getConfig().getBoolean("chat") == true){
		          Bukkit.broadcastMessage(ChatColor.AQUA + "Global " + ChatColor.GRAY + "" + ChatColor.BOLD + "[" + ChatColor.RESET + user.getPrefix() +ChatColor.GRAY + "" + ChatColor.BOLD +  "] " + ChatColor.RESET + p.getDisplayName() + " : " + event.getMessage().replace("!", ""));
		          Bukkit.getLogger().log(Level.INFO,ChatColor.BLUE + "Global " + ChatColor.RESET + user.getPrefix() + " " + p.getDisplayName() + " : " + event.getMessage().replace("!", ""));
		          event.setCancelled(true);
		          
			 } else if(p.hasPermission("kingdom.tatanka")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Tatanka"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.tatanka");
				 Bukkit.getLogger().log(Level.INFO,"Tatanka "+ p.getDisplayName() + " : " + message);
				 
			 } else if(p.hasPermission("kingdom.trados")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Trados"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.trados");
				 Bukkit.getLogger().log(Level.INFO,"Trados "+ p.getDisplayName() + " : " + message);
				
			 } else if(p.hasPermission("kingdom.oranos")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Oranos"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.oranos");
				 Bukkit.getLogger().log(Level.INFO,"Oranos "+ p.getDisplayName() + " : " + message);
	
			 } else if(p.hasPermission("kingdom.bovarie")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Bovarie"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.bovarie");
				 Bukkit.getLogger().log(Level.INFO,"Bovarie"+ p.getDisplayName() + " : " + message);
		 
			 } else if(p.hasPermission("kingdom.fraza")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Fraza"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.fraza");
				 Bukkit.getLogger().log(Level.INFO,"Fraza"+ p.getDisplayName() + " : " + message);
			
			 } else if(p.hasPermission("kingdom.triano")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Triano"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.triano");
				 Bukkit.getLogger().log(Level.INFO,"Triano"+ p.getDisplayName() + " : " + message);
				
			 } else if(p.hasPermission("kingdom.rovanie")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Rovanie"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.rovanie");
				 Bukkit.getLogger().log(Level.INFO,"Rovanie"+ p.getDisplayName() + " : " + message);
		
			 } else if(p.hasPermission("kingdom.terra")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Terra"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.terra");
				 Bukkit.getLogger().log(Level.INFO,"Terra"+ p.getDisplayName() + " : " + message);
				 
			 } else if(p.hasPermission("kingdom.Tyga")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Tyga"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.tyga");
				 Bukkit.getLogger().log(Level.INFO,"Tyga"+ p.getDisplayName() + " : " + message);
		 
			 } else if(p.hasPermission("kingdom.Orebro")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Orebro"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.orebro");
				 Bukkit.getLogger().log(Level.INFO,"Orebro"+ p.getDisplayName() + " : " + message);
				 
			 } else if(p.hasPermission("kingdom.Zzerffixia")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Zzerffixia"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.zzerffixia");
				 Bukkit.getLogger().log(Level.INFO,"Zzerffixia"+ p.getDisplayName() + " : " + message);
				 
			 } else if(p.hasPermission("kingdom.Eltro")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Eltro"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.eltro");
				 Bukkit.getLogger().log(Level.INFO,"Eltro"+ p.getDisplayName() + " : " + message);
				 
			 } else if(p.hasPermission("kingdom.Tredia")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Tredia"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.tredia");
				 Bukkit.getLogger().log(Level.INFO,"Tredia"+ p.getDisplayName() + " : " + message);
			 }
	}
	
}

	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("clearchat")){
			Player player = player(sender);
			Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");Bukkit.broadcastMessage(" ");
			Bukkit.broadcast(ChatColor.GREEN + "The chat is cleared by: "  + ChatColor.AQUA + player.getDisplayName(), Server.BROADCAST_CHANNEL_ADMINISTRATIVE);
		}
		
		
		
		if(cmd.getName().equalsIgnoreCase("chaton")){
			if(this.getConfig().getBoolean("chat") == false){
				Main.this.getConfig().set("chat", true);
				this.saveConfig();
				Player player = (Player)sender;
				Bukkit.broadcastMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "The chat is avaible again for users");
				Bukkit.broadcast(ChatColor.GREEN + "The chat is enabled by: "  + ChatColor.AQUA + player.getDisplayName(), Server.BROADCAST_CHANNEL_ADMINISTRATIVE);
			}
			else{
				Player player = (Player)sender;
				player.sendMessage(ChatColor.RED + "The chat is already enabled");
			}
	}
	if(cmd.getName().equalsIgnoreCase("chatoff")){
		if(this.getConfig().getBoolean("chat") == true){
			Main.this.getConfig().set("chat", false);
			this.saveConfig();
			Player player = (Player)sender;
			Bukkit.broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + "The chat is now only avaible for admins");
			Bukkit.broadcast(ChatColor.RED + "The chat is disabled by: "  + ChatColor.AQUA + player.getDisplayName(), Server.BROADCAST_CHANNEL_ADMINISTRATIVE);
		}
		else {
			Player player = (Player)sender;
			player.sendMessage(ChatColor.RED + "The chat is already disabled");
		}
	}
	return false;
	}




	private Player player(CommandSender sender) {
		return null;
	}
}
