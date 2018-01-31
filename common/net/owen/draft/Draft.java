package net.owen.draft;

import java.util.Random;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.launcher.FMLInjectionAndSortingTweaker;


@Mod(modid = Draft.MOD_ID, name = Draft.MOD_NAME, version = Draft.VERSION, dependencies = Draft.DEPENDENCIES)
public class Draft {
	
  // Constants
	public static  final String MOD_ID = "draft";
	public static  final String MOD_NAME = "Draft";
	public static  final String VERSION = "@VERSION@";
	public static  final String DEPENDENCIES = "required-after:forge@[14.23.1.2555,)";
	public static  final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	
	// Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static Draft instance;
	
	@SidedProxy(clientSide = "net.owen.draft.ClientProxy", serverSide = "net.owen.draft.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void PreIntit(FMLPreInitializationEvent event) {
	    
	    proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	    
	    proxy.init(event);
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
	    
	    proxy.postInit(event);
	}
	
}
