/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.customwands;

import org.bukkit.plugin.java.JavaPlugin;

import net.mcreator.customwands.procedures.CustomKingdomWandsCommandExecutedProcedure;
import net.mcreator.customwands.command.CustomKingdomWands;

public class CustomwandsMod extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getCommand("CustomKingdomWands").setExecutor(new CustomKingdomWands());
		getServer().getPluginManager().registerEvents(new CustomKingdomWandsCommandExecutedProcedure(), this);
	}

	@Override
	public void onDisable() {
	}
}
