package com.github.Comrod.antarcticamod;

import net.minecraft.item.Item;

import com.github.Comrod.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class AntarcticaMod
{
	private final static Item penguinMeat = new ItemPenguinMeat(6000);
	
	
	@SidedProxy(clientSide = "com.github.Comrod.antarcticamod.client.ClientProxy", serverSide = "com.github.Comrod.antarcticamod.CommonProxy")
	public static CommonProxy proxy;
	
	//Pre-Initialization
	@EventHandler
	public void load(FMLPreInitializationEvent event)
	{
		System.out.println("Pre Initialization done");
	}
	
	//Initialization
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		LanguageRegistry.addName(penguinMeat, "Penguin Meat");
		
		System.out.println("Initialization done");
	}
	
	//Post-Initialization
	@EventHandler
	public void load(FMLPostInitializationEvent event)
	{
		System.out.println("Post Initialization done");
	}
}
