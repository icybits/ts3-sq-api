package de.icybits.ts3.sq.api.properties;
/**
 * 
 * @author Saali
 *
 */

public class ClientPropertiesVoid extends ClientProperties<Void>{
	
	public static final ClientPropertiesVoid CLIENT_UNIQUE_IDENTIFIER = new ClientPropertiesVoid("CLIENT_UNIQUE_IDENTIFIER", false);
	public static final ClientPropertiesVoid CLIENT_VERSION = new ClientPropertiesVoid("CLIENT_VERSION", false);
	public static final ClientPropertiesVoid CLIENT_PLATFORM = new ClientPropertiesVoid("CLIENT_PLATFORM", false);
	public static final ClientPropertiesVoid CLIENT_INPUT_MUTED = new ClientPropertiesVoid("CLIENT_INPUT_MUTED", false);
	public static final ClientPropertiesVoid CLIENT_OUTPUT_MUTED = new ClientPropertiesVoid("CLIENT_OUTPUT_MUTED", false);
	public static final ClientPropertiesVoid CLIENT_INPUT_HARDWARE = new ClientPropertiesVoid("CLIENT_INPUT_HARDWARE", false);
	public static final ClientPropertiesVoid CLIENT_OUTPUT_HARDWARE = new ClientPropertiesVoid("CLIENT_OUTPUT_HARDWARE", false);
	public static final ClientPropertiesVoid CLIENT_DEFAULT_CHANNEL = new ClientPropertiesVoid("CLIENT_DEFAULT_CHANNEL", false);
	public static final ClientPropertiesVoid CLIENT_LOGIN_NAME = new ClientPropertiesVoid("CLIENT_LOGIN_NAME", false);
	public static final ClientPropertiesVoid CLIENT_DATABASE_ID = new ClientPropertiesVoid("CLIENT_DATABASE_ID", false);
	public static final ClientPropertiesVoid CLIENT_CHANNEL_GROUP_ID = new ClientPropertiesVoid("CLIENT_CHANNEL_GROUP_ID", false);
	public static final ClientPropertiesVoid CLIENT_SERVER_GROUPS = new ClientPropertiesVoid("CLIENT_SERVER_GROUPS", false);
	public static final ClientPropertiesVoid CLIENT_CREATED = new ClientPropertiesVoid("CLIENT_CREATED", false);
	public static final ClientPropertiesVoid CLIENT_LASTCONNECTED = new ClientPropertiesVoid("CLIENT_LASTCONNECTED", false);
	public static final ClientPropertiesVoid CLIENT_TOTALCONNECTIONS = new ClientPropertiesVoid("CLIENT_TOTALCONNECTIONS", false);
	public static final ClientPropertiesVoid CLIENT_AWAY = new ClientPropertiesVoid("CLIENT_AWAY", false);
	public static final	ClientPropertiesVoid CLIENT_AWAY_MESSAGE = new ClientPropertiesVoid("CLIENT_AWAY_MESSAGE", false);
	public static final ClientPropertiesVoid CLIENT_TYPE = new ClientPropertiesVoid("CLIENT_TYPE", false);
	public static final ClientPropertiesVoid CLIENT_FLAG_AVATAR = new ClientPropertiesVoid("CLIENT_FLAG_AVATAR", false);
	public static final ClientPropertiesVoid CLIENT_TALK_POWER = new ClientPropertiesVoid("CLIENT_TALK_POWER", false);
	public static final ClientPropertiesVoid CLIENT_TALK_REQUEST = new ClientPropertiesVoid("CLIENT_TALK_REQUEST", false);
	public static final ClientPropertiesVoid CLIENT_TALK_REQUEST_MSG = new ClientPropertiesVoid("CLIENT_TALK_REQUEST_MSG", false);
	public static final ClientPropertiesVoid CLIENT_MONTH_BYTES_DOWNLOADED = new ClientPropertiesVoid("CLIENT_MONTH_BYTES_DOWNLOADED", false);
	public static final ClientPropertiesVoid CLIENT_MONTH_BYTES_UPLOADED = new ClientPropertiesVoid("CLIENT_MONTH_BYTES_UPLOADED", false);
	public static final ClientPropertiesVoid CLIENT_TOTAL_BYTES_DOWNLOADED = new ClientPropertiesVoid("CLIENT_TOTAL_BYTES_DOWNLOADED", false);
	public static final ClientPropertiesVoid CLIENT_TOTAL_BYTES_UPLOADED = new ClientPropertiesVoid("CLIENT_TOTAL_BYTES_UPLOADED", false);
	public static final ClientPropertiesVoid CLIENT_IS_PRIORITY_SPEAKER = new ClientPropertiesVoid("CLIENT_IS_PRIORITY_SPEAKER", false);
	public static final ClientPropertiesVoid CLIENT_UNREAD_MESSAGES = new ClientPropertiesVoid("CLIENT_UNREAD_MESSAGES", false);
	public static final ClientPropertiesVoid CLIENT_NICKNAME_PHONETIC = new ClientPropertiesVoid("CLIENT_NICKNAME_PHONETIC ", false);
	public static final ClientPropertiesVoid CLIENT_NEEDED_SERVERQUERY_VIEW_POWER = new ClientPropertiesVoid("CLIENT_NEEDED_SERVERQUERY_VIEW_POWER", false);
	public static final ClientPropertiesVoid CONNECTION_FILETRANSFER_BANDWIDTH_SENT = new ClientPropertiesVoid("CONNECTION_FILETRANSFER_BANDWIDTH_SENT", false);
	public static final ClientPropertiesVoid CONNECTION_FILETRANSFER_BANDWIDTH_RECEIVED = new ClientPropertiesVoid("CONNECTION_FILETRANSFER_BANDWIDTH_RECEIVED", false);
	public static final ClientPropertiesVoid CONNECTION_PACKETS_SENT_TOTAL = new ClientPropertiesVoid("CONNECTION_PACKETS_SENT_TOTAL", false);
	public static final ClientPropertiesVoid CONNECTION_PACKETS_RECEIVED_TOTAL = new ClientPropertiesVoid("CONNECTION_PACKETS_RECEIVED_TOTAL", false);
	public static final ClientPropertiesVoid CONNECTION_BANDWIDTH_SENT_LAST_SECOND_TOTAL = new ClientPropertiesVoid("CONNECTION_BANDWIDTH_SENT_LAST_SECOND_TOTAL", false);
	public static final ClientPropertiesVoid CONNECTION_BANDWIDTH_RECEIVED_LAST_SECOND_TOTAL = new ClientPropertiesVoid("CONNECTION_BANDWIDTH_RECEIVED_LAST_SECOND_TOTAL", false);
	public static final ClientPropertiesVoid CONNECTION_BANDWIDTH_SENT_LAST_MINUTE_TOTAL = new ClientPropertiesVoid("CONNECTION_BANDWIDTH_SENT_LAST_MINUTE_TOTAL", false);
	public static final ClientPropertiesVoid CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL = new ClientPropertiesVoid("CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL", false);
	public static final ClientPropertiesVoid CONNECTION_CLIENT_IP = new ClientPropertiesVoid("CONNECTION_CLIENT_IP", false);
	public static final ClientPropertiesVoid CLIENT_COUNTRY = new ClientPropertiesVoid("CLIENT_COUNTRY", false);
	
	private ClientPropertiesVoid(String name, Boolean changeable) {
		super(name, changeable);
	}

}
