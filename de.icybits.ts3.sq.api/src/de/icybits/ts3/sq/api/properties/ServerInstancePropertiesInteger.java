package de.icybits.ts3.sq.api.properties;

public class ServerInstancePropertiesInteger extends ServerInstanceProperties<Integer>{
	
	public static final ServerInstancePropertiesInteger SERVERINSTANCE_GUEST_SERVERQUERY_GROUP = new ServerInstancePropertiesInteger("SERVERINSTANCE_GUEST_SERVERQUERY_GROUP", false);
	public static final ServerInstancePropertiesInteger SERVERINSTANCE_TEMPLATE_SERVERADMIN_GROUP = new ServerInstancePropertiesInteger("SERVERINSTANCE_TEMPLATE_SERVERADMIN_GROUP", false);
	public static final ServerInstancePropertiesInteger SERVERINSTANCE_FILETRANSFER_PORT = new ServerInstancePropertiesInteger("SERVERINSTANCE_FILETRANSFER_PORT", false);
	public static final ServerInstancePropertiesInteger SERVERINSTANCE_MAX_DOWNLOAD_TOTAL_BANDWITDH = new ServerInstancePropertiesInteger("SERVERINSTANCE_MAX_DOWNLOAD_TOTAL_BANDWITDH", false);
	public static final ServerInstancePropertiesInteger SERVERINSTANCE_MAX_UPLOAD_TOTAL_BANDWITDH = new ServerInstancePropertiesInteger("SERVERINSTANCE_MAX_UPLOAD_TOTAL_BANDWITDH", false);
	public static final ServerInstancePropertiesInteger SERVERINSTANCE_TEMPLATE_SERVERDEFAULT_GROUP = new ServerInstancePropertiesInteger("SERVERINSTANCE_TEMPLATE_SERVERDEFAULT_GROUP", false);
	public static final ServerInstancePropertiesInteger SERVERINSTANCE_TEMPLATE_CHANNELDEFAULT_GROUP = new ServerInstancePropertiesInteger("SERVERINSTANCE_TEMPLATE_CHANNELDEFAULT_GROUP", false);
	public static final ServerInstancePropertiesInteger SERVERINSTANCE_TEMPLATE_CHANNELADMIN_GROUP = new ServerInstancePropertiesInteger("SERVERINSTANCE_TEMPLATE_CHANNELADMIN_GROUP", false);
	public static final ServerInstancePropertiesInteger SERVERINSTANCE_SERVERQUERY_FLOOD_COMMANDS = new ServerInstancePropertiesInteger("SERVERINSTANCE_SERVERQUERY_FLOOD_COMMANDS", false);
	public static final ServerInstancePropertiesInteger SERVERINSTANCE_SERVERQUERY_FLOOD_TIME = new ServerInstancePropertiesInteger("SERVERINSTANCE_SERVERQUERY_FLOOD_TIME", false);
	public static final ServerInstancePropertiesInteger SERVERINSTANCE_SERVERQUERY_FLOOD_BAN_TIME = new ServerInstancePropertiesInteger("SERVERINSTANCE_SERVERQUERY_FLOOD_BAN_TIME", false);
	
	private ServerInstancePropertiesInteger(String name, Boolean changeable) {
		super(name, changeable);
	}
	
}
