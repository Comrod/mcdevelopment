package com.github.Comrod.antarcticamod;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemPenguinMeat extends Item {

	public ItemPenguinMeat(int id) {
		super(id);
		maxStackSize = 64;
		setCreativeTab(CreativeTabs.tabFood);
		setUnlocalizedName("penguinMeat");
	}

}
