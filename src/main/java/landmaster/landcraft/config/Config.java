package landmaster.landcraft.config;

import net.minecraftforge.common.config.*;
import net.minecraftforge.fml.common.event.*;

public class Config extends Configuration {
	public static boolean breeder;
	public static boolean player_mime;
	public static boolean thorium_generator;
	public static boolean wrench;
	
	public static int landiaDimensionID;
	
	public Config(FMLPreInitializationEvent event) {
		super(event.getSuggestedConfigurationFile());
	}
	
	public void sync() {
		breeder = getBoolean("Enable Breeder Reactor", "machines", true, "Enable Breeder Reactor");
		player_mime = getBoolean("Enable Player Mime", "machines", true, "Enable Player Mime");
		thorium_generator = getBoolean("Enable Thorium Generator", "machines", true, "Enable Thorium Generator");
		
		wrench = getBoolean("Enable Wrench", "tools", true, "Enable Wrench");
		
		landiaDimensionID = getInt("Dimension ID of Landia", "dimensions", 1304, Integer.MIN_VALUE, Integer.MAX_VALUE, "Dimension ID of Landia");
		
		if (hasChanged()) save();
	}
}
