package info.is2005.stoneyintegration;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TheMod.MODID, version = TheMod.VERSION, dependencies = "required-after:EnderIO;required-after:Natura;required-after:appliedenergistics2;required-after:harvestcraft")
public class TheMod
{
    public static final String MODID = "stoneyintegration";
    public static final String VERSION = "0.1";
    @SidedProxy(clientSide="info.is2005.stoneyintegration.ClientProxy", serverSide="info.is2005.stoneyintegration.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit(e);
    }
}