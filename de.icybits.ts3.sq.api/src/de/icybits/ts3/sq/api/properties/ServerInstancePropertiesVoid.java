package de.icybits.ts3.sq.api.properties;

/**
 * 
 * @author Saali
 *
 */

public class ServerInstancePropertiesVoid extends ServerInstanceProperties<Void> {
	
	public static final ServerInstancePropertiesVoid INSTANCE_UPTIME = new ServerInstancePropertiesVoid("INSTANCE_UPTIME", false);
	public static final ServerInstancePropertiesVoid HOST_TIMESTAMP_UTC = new ServerInstancePropertiesVoid("HOST_TIMESTAMP_UTC", false);
	public static final ServerInstancePropertiesVoid VIRTUALSERVERS_RUNNING_TOTAL = new ServerInstancePropertiesVoid("VIRTUALSERVERS_RUNNING_TOTAL", false);
	public static final ServerInstancePropertiesVoid CONNECTION_FILETRANSFER_BANDWIDTH_SENT = new ServerInstancePropertiesVoid("CONNECTION_FILETRANSFER_BANDWIDTH_SENT", false);
	public static final ServerInstancePropertiesVoid CONNECTION_FILETRANSFER_BANDWIDTH_RECEIVED = new ServerInstancePropertiesVoid("CONNECTION_FILETRANSFER_BANDWIDTH_RECEIVED", false);
	public static final ServerInstancePropertiesVoid CONNECTION_PACKETS_SENT_TOTAL = new ServerInstancePropertiesVoid("CONNECTION_PACKETS_SENT_TOTAL", false);
	public static final ServerInstancePropertiesVoid CONNECTION_PACKETS_RECEIVED_TOTAL = new ServerInstancePropertiesVoid("CONNECTION_PACKETS_RECEIVED_TOTAL", false);
	public static final ServerInstancePropertiesVoid CONNECTION_BYTES_SENT_TOTAL = new ServerInstancePropertiesVoid("CONNECTION_BYTES_SENT_TOTAL", false);
	public static final ServerInstancePropertiesVoid CONNECTION_BYTES_RECEIVED_TOTAL = new ServerInstancePropertiesVoid("CONNECTION_BYTES_RECEIVED_TOTAL", false);
	public static final ServerInstancePropertiesVoid CONNECTION_BANDWIDTH_SENT_LAST_SECOND_TOTAL = new ServerInstancePropertiesVoid("CONNECTION_BANDWIDTH_SENT_LAST_SECOND_TOTAL", false);
	public static final ServerInstancePropertiesVoid CONNECTION_BANDWIDTH_RECEIVED_LAST_SECOND_TOTAL = new ServerInstancePropertiesVoid("CONNECTION_BANDWIDTH_RECEIVED_LAST_SECOND_TOTAL", false);
	public static final ServerInstancePropertiesVoid CONNECTION_BANDWIDTH_SENT_LAST_MINUTE_TOTAL = new ServerInstancePropertiesVoid("CONNECTION_BANDWIDTH_SENT_LAST_MINUTE_TOTAL", false);
	public static final ServerInstancePropertiesVoid CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL = new ServerInstancePropertiesVoid("CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL", false);
	public static final ServerInstancePropertiesVoid SERVERINSTANCE_DATABASE_VERSION = new ServerInstancePropertiesVoid("SERVERINSTANCE_DATABASE_VERSION", false);
	public static final ServerInstancePropertiesVoid VIRTUALSERVERS_TOTAL_MAXCLIENTS = new ServerInstancePropertiesVoid("VIRTUALSERVERS_TOTAL_MAXCLIENTS", false);
	public static final ServerInstancePropertiesVoid VIRTUALSERVERS_TOTAL_CLIENTS_ONLINE = new ServerInstancePropertiesVoid("VIRTUALSERVERS_TOTAL_CLIENTS_ONLINE", false);
	public static final ServerInstancePropertiesVoid VIRTUALSERVERS_TOTAL_CHANNELS_ONLINE = new ServerInstancePropertiesVoid("VIRTUALSERVERS_TOTAL_CHANNELS_ONLINE", false);

	private ServerInstancePropertiesVoid(String name, Boolean changeable) {
		super(name, changeable);
	}

}
