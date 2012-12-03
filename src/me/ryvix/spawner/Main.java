/**
 *   Spawner - Gather mob spawners with silk touch enchanted tools and the
 *   ability to change mob types.
 *
 *   Copyright (C) 2012 Ryan Rhode - rrhode@gmail.com
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package me.ryvix.spawner;

import java.util.Random;

import me.ryvix.spawner.SpawnerCommands;

import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	public Random gen = new Random();

	@Override
	public void onEnable() {

		getServer().getPluginManager().registerEvents(new me.ryvix.spawner.SpawnerEvents(this), this);

		// don't allow mob spawners to stack
		com.bergerkiller.bukkit.common.reflection.SafeField.set(net.minecraft.server.Item.byId[Material.MOB_SPAWNER.getId()], "maxStackSize", 1);

		// spawner
		getCommand("spawner").setExecutor(new SpawnerCommands(this));
	}

	@Override
	public void onDisable() {
	}
}