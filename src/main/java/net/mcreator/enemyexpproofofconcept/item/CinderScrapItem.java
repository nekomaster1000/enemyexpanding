
package net.mcreator.enemyexpproofofconcept.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CinderScrapItem extends Item {
	public CinderScrapItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(8).fireResistant().rarity(Rarity.RARE));
	}
}
