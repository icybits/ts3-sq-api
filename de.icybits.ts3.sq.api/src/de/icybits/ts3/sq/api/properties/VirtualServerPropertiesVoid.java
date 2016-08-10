package de.icybits.ts3.sq.api.properties;
/**
 * 
 * @author Saali
 *
 */
public class VirtualServerPropertiesVoid extends VirtualServerProperties<Void> {

	public static final VirtualServerPropertiesVoid VIRTUALSERVER_FLAG_PASSWORD = new VirtualServerPropertiesVoid("VIRTUALSERVER_FLAG_PASSWORD", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_CLIENTSONLINE = new VirtualServerPropertiesVoid("VIRTUALSERVER_CLIENTSONLINE", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_QUERYCLIENTSONLINE = new VirtualServerPropertiesVoid("VIRTUALSERVER_QUERYCLIENTSONLINE", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_CHANNELSONLINE = new VirtualServerPropertiesVoid("VIRTUALSERVER_CHANNELSONLINE", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_CREATED = new VirtualServerPropertiesVoid("VIRTUALSERVER_CREATED", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_UPTIME = new VirtualServerPropertiesVoid("VIRTUALSERVER_UPTIME", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_PLATFORM = new VirtualServerPropertiesVoid("VIRTUALSERVER_PLATFORM", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_VERSION = new VirtualServerPropertiesVoid("VIRTUALSERVER_VERSION", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_ASK_FOR_PRIVILEGEKEY = new VirtualServerPropertiesVoid("VIRTUALSERVER_ASK_FOR_PRIVILEGEKEY", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_CLIENT_CONNECTIONS = new VirtualServerPropertiesVoid("VIRTUALSERVER_CLIENT_CONNECTIONS", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_QUERY_CLIENT_CONNECTIONS = new VirtualServerPropertiesVoid("VIRTUALSERVER_QUERY_CLIENT_CONNECTIONS", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_MONTH_BYTES_UPLOADED = new VirtualServerPropertiesVoid("VIRTUALSERVER_MONTH_BYTES_UPLOADED", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_TOTAL_BYTES_DOWNLOADED = new VirtualServerPropertiesVoid("VIRTUALSERVER_TOTAL_BYTES_DOWNLOADED", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_TOTAL_BYTES_UPLOADED = new VirtualServerPropertiesVoid("VIRTUALSERVER_TOTAL_BYTES_UPLOADED", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_UNIQUE_IDENTIFER = new VirtualServerPropertiesVoid("VIRTUALSERVER_UNIQUE_IDENTIFER", false);
	public static final VirtualServerPropertiesVoid VIRTUALSERVER_ID = new VirtualServerPropertiesVoid("VIRTUALSERVER_ID", false);
	public static final VirtualServerPropertiesVoid CONNECTION_FILETRANSFER_BANDWIDTH_SENT = new VirtualServerPropertiesVoid("CONNECTION_FILETRANSFER_BANDWIDTH_SENT", false);
	public static final VirtualServerPropertiesVoid CONNECTION_FILETRANSFER_BANDWIDTH_RECEIVED = new VirtualServerPropertiesVoid("CONNECTION_FILETRANSFER_BANDWIDTH_RECEIVED", false);
	public static final VirtualServerPropertiesVoid CONNECTION_PACKETS_SENT_TOTAL = new VirtualServerPropertiesVoid("CONNECTION_PACKETS_SENT_TOTAL", false);
	public static final VirtualServerPropertiesVoid CONNECTION_PACKETS_RECEIVED_TOTAL = new VirtualServerPropertiesVoid("CONNECTION_PACKETS_RECEIVED_TOTAL", false);
	public static final VirtualServerPropertiesVoid CONNECTION_BYTES_SENT_TOTAL = new VirtualServerPropertiesVoid("CONNECTION_BYTES_SENT_TOTAL", false);
	public static final VirtualServerPropertiesVoid CONNECTION_BYTES_RECEIVED_TOTAL = new VirtualServerPropertiesVoid("CONNECTION_BYTES_RECEIVED_TOTAL", false);
	public static final VirtualServerPropertiesVoid CONNECTION_BANDWIDTH_SENT_LAST_SECOND_TOTAL = new VirtualServerPropertiesVoid("CONNECTION_BANDWIDTH_SENT_LAST_SECOND_TOTAL", false);
	public static final VirtualServerPropertiesVoid CONNECTION_BANDWIDTH_RECEIVED_LAST_SECOND_TOTAL = new VirtualServerPropertiesVoid("CONNECTION_BANDWIDTH_RECEIVED_LAST_SECOND_TOTAL", false);
	public static final VirtualServerPropertiesVoid CONNECTION_BANDWIDTH_SENT_LAST_MINUTE_TOTAL = new VirtualServerPropertiesVoid("CONNECTION_BANDWIDTH_SENT_LAST_MINUTE_TOTAL", false);
	public static final VirtualServerPropertiesVoid CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL = new VirtualServerPropertiesVoid("CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL", false);
	
	private VirtualServerPropertiesVoid(String name, Boolean changeable) {
		super(name, changeable);
	}

}
