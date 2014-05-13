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
		        
		          Bukkit.broadcast(user.getPrefix() + message,	"test");
		 
		 
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
