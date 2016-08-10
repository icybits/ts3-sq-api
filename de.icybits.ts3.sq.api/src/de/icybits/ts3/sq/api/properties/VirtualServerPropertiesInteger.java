package de.icybits.ts3.sq.api.properties;

/**
 * 
 * @author Saali
 *
 */

public class VirtualServerPropertiesInteger extends VirtualServerProperties<Integer>{
	
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_MAXCLIENTS = new VirtualServerPropertiesInteger("VIRTUALSERVER_MAXCLIENTS", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_DEFAULT_SERVER_GROUP = new VirtualServerPropertiesInteger("VIRTUALSERVER_DEFAULT_SERVER_GROUP", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_DEFAULT_CHANNEL_GROUP = new VirtualServerPropertiesInteger("VIRTUALSERVER_DEFAULT_CHANNEL_GROUP", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_DEFAULT_CHANNEL_ADMIN_GROUP = new VirtualServerPropertiesInteger("VIRTUALSERVER_DEFAULT_CHANNEL_ADMIN_GROUP", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_MAX_DOWNLOAD_TOTAL_BANDWIDTH  = new VirtualServerPropertiesInteger("VIRTUALSERVER_MAX_DOWNLOAD_TOTAL_BANDWIDTH", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_MAX_UPLOAD_TOTAL_BANDWIDTH  = new VirtualServerPropertiesInteger("VIRTUALSERVER_MAX_UPLOAD_TOTAL_BANDWIDTH", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_HOSTBANNER_GFX_INTERVAL = new VirtualServerPropertiesInteger("VIRTUALSERVER_HOSTBANNER_GFX_INTERVAL", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_COMPLAIN_AUTOBAN_COUNT = new VirtualServerPropertiesInteger("VIRTUALSERVER_COMPLAIN_AUTOBAN_COUNT", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_COMPLAIN_AUTOBAN_TIME = new VirtualServerPropertiesInteger("VIRTUALSERVER_COMPLAIN_AUTOBAN_TIME", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_COMPLAIN_REMOVE_TIME = new VirtualServerPropertiesInteger("VIRTUALSERVER_COMPLAIN_REMOVE_TIME", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_MIN_CLIENTS_IN_CHANNEL_BEFORE_FORCED_SILENCE = new VirtualServerPropertiesInteger("VIRTUALSERVER_MIN_CLIENTS_IN_CHANNEL_BEFORE_FORCED_SILENCE", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_PRIORITY_SPEAKER_DIMM_MODIFICATOR = new VirtualServerPropertiesInteger("VIRTUALSERVER_PRIORITY_SPEAKER_DIMM_MODIFICATOR", true); //TODO check if Boolean or Integer (should be an integer though)
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_ANTIFLOOD_POINTS_TICK_REDUCE = new VirtualServerPropertiesInteger("VIRTUALSERVER_ANTIFLOOD_POINTS_TICK_REDUCE", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_ANTIFLOOD_POINTS_NEEDED_COMMAND_BLOCK = new VirtualServerPropertiesInteger("VIRTUALSERVER_ANTIFLOOD_POINTS_NEEDED_COMMAND_BLOCK", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_ANTIFLOOD_POINTS_NEEDED_IP_BLOCK = new VirtualServerPropertiesInteger("VIRTUALSERVER_ANTIFLOOD_POINTS_NEEDED_IP_BLOCK", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_DOWNLOAD_QUOTA = new VirtualServerPropertiesInteger("VIRTUALSERVER_DOWNLOAD_QUOTA", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_UPLOAD_QUOTA = new VirtualServerPropertiesInteger("VIRTUALSERVER_UPLOAD_QUOTA", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_MACHINE_ID = new VirtualServerPropertiesInteger("VIRTUALSERVER_MACHINE_ID", true);
	public static final VirtualServerPropertiesInteger VIRTUALSERVER_PORT = new VirtualServerPropertiesInteger("VIRTUALSERVER_PORT", true);
	
	private VirtualServerPropertiesInteger(String name, Boolean changeable) {
		super(name, changeable);
	}

}
