package info.is2005.stoneyintegration;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;

public class CommonProxy
{

    public void preInit(FMLPreInitializationEvent e)
    {
    	//ModItems.createItems();
    }

    public void init(FMLInitializationEvent e)
    {
    	Item ae2_flour = GameRegistry.findItem(Constants.ModIDs.AppliedEnergistics2, Constants.Items.AppliedEnergistics2.FlourName);
    	Item enderio_flour = GameRegistry.findItem(Constants.ModIDs.EnderIO, Constants.Items.EnderIO.FlourName);
    	Item harvestcraft_flour = GameRegistry.findItem(Constants.ModIDs.Harvestcraft, Constants.Items.Harvestcraft.FlourName);
    	Item natura_flour = GameRegistry.findItem(Constants.ModIDs.Natura, Constants.Items.Natura.FlourName);
    	Item natura_barley = GameRegistry.findItem(Constants.ModIDs.Natura, Constants.Items.Natura.BarleyName);
    	
    	OreDictionary.registerOre("foodFlour", new ItemStack(ae2_flour, 1, Constants.Items.AppliedEnergistics2.FlourMD));
    	OreDictionary.registerOre("foodFlour", new ItemStack(enderio_flour, 1, Constants.Items.EnderIO.FlourMD));
    	OreDictionary.registerOre("foodFlour", new ItemStack(natura_flour, 1, Constants.Items.Natura.BarleyFlourMD));
    	OreDictionary.registerOre("foodFlour", new ItemStack(natura_flour, 1, Constants.Items.Natura.WheatFlourMD));
    	
    	OreDictionary.registerOre("listAllGrain", natura_barley);
    	
    	GameRegistry.addSmelting(harvestcraft_flour, new ItemStack(Items.bread), 0.1f);
    }

    public void postInit(FMLPostInitializationEvent e)
    {

    }
}