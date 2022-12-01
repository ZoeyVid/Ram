package de.zoeyvid.ram;

import de.zoeyvid.ram.commands.ramCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

  @Override
  public void onEnable() {
    getCommand("ram").setExecutor(new ramCommand());
    Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "RAM has been enabled!");
  }

  @Override
  public void onDisable() {
    Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "RAM has been disabled!");
  }
}
