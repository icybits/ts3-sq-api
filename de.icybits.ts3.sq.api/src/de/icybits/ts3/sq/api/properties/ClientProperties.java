package de.icybits.ts3.sq.api.properties;
/**
 * @author Saali
 */

import de.icybits.ts3.sq.api.basic.Properties;

public class ClientProperties<K> extends Properties {
	
	public static final ClientProperties<Boolean> CLIENT_IS_TALKER = ClientPropertiesBoolean.CLIENT_IS_TALKER;
	public static final ClientProperties<Integer> CLIENT_ICON_ID = ClientPropertiesInteger.CLIENT_ICON_ID;
	public static final ClientProperties<String> CLIENT_NICKNAME = ClientPropertiesString.CLIENT_NICKNAME;
	public static final ClientProperties<String> CLIENT_DESCRIPTION = ClientPropertiesString.CLIENT_DESCRIPTION;
	public static final ClientProperties<Void> CLIENT_UNIQUE_IDENTIFIER = ClientPropertiesVoid.CLIENT_UNIQUE_IDENTIFIER;
	public static final ClientProperties<Void> CLIENT_VERSION = ClientPropertiesVoid.CLIENT_VERSION;
	public static final ClientProperties<Void> CLIENT_PLATFORM = ClientPropertiesVoid.CLIENT_PLATFORM;
	public static final ClientProperties<Void> CLIENT_INPUT_MUTED = ClientPropertiesVoid.CLIENT_INPUT_MUTED;
	public static final ClientProperties<Void> CLIENT_OUTPUT_MUTED = ClientPropertiesVoid.CLIENT_OUTPUT_MUTED;
	public static final ClientProperties<Void> CLIENT_INPUT_HARDWARE = ClientPropertiesVoid.CLIENT_INPUT_HARDWARE;
	public static final ClientProperties<Void> CLIENT_OUTPUT_HARDWARE = ClientPropertiesVoid.CLIENT_OUTPUT_HARDWARE;
	public static final ClientProperties<Void> CLIENT_DEFAULT_CHANNEL = ClientPropertiesVoid.CLIENT_DEFAULT_CHANNEL;
	public static final ClientProperties<Void> CLIENT_LOGIN_NAME = ClientPropertiesVoid.CLIENT_LOGIN_NAME;
	public static final ClientProperties<Void> CLIENT_DATABASE_ID = ClientPropertiesVoid.CLIENT_DATABASE_ID;
	public static final ClientProperties<Void> CLIENT_CHANNEL_GROUP_ID = ClientPropertiesVoid.CLIENT_CHANNEL_GROUP_ID;
	public static final ClientProperties<Void> CLIENT_SERVER_GROUPS = ClientPropertiesVoid.CLIENT_SERVER_GROUPS;
	public static final ClientProperties<Void> CLIENT_CREATED = ClientPropertiesVoid.CLIENT_CREATED;
	public static final ClientProperties<Void> CLIENT_LASTCONNECTED = ClientPropertiesVoid.CLIENT_LASTCONNECTED;
	public static final ClientProperties<Void> CLIENT_TOTALCONNECTIONS = ClientPropertiesVoid.CLIENT_TOTALCONNECTIONS;
	public static final ClientProperties<Void> CLIENT_AWAY = ClientPropertiesVoid.CLIENT_AWAY;
	public static final	ClientProperties<Void> CLIENT_AWAY_MESSAGE = ClientPropertiesVoid.CLIENT_AWAY_MESSAGE;
	public static final ClientProperties<Void> CLIENT_TYPE = ClientPropertiesVoid.CLIENT_TYPE;
	public static final ClientProperties<Void> CLIENT_FLAG_AVATAR = ClientPropertiesVoid.CLIENT_FLAG_AVATAR;
	public static final ClientProperties<Void> CLIENT_TALK_POWER = ClientPropertiesVoid.CLIENT_TALK_POWER;
	public static final ClientProperties<Void> CLIENT_TALK_REQUEST = ClientPropertiesVoid.CLIENT_TALK_REQUEST;
	public static final ClientProperties<Void> CLIENT_TALK_REQUEST_MSG = ClientPropertiesVoid.CLIENT_TALK_REQUEST_MSG;
	public static final ClientProperties<Void> CLIENT_MONTH_BYTES_DOWNLOADED = ClientPropertiesVoid.CLIENT_MONTH_BYTES_DOWNLOADED;
	public static final ClientProperties<Void> CLIENT_MONTH_BYTES_UPLOADED = ClientPropertiesVoid.CLIENT_MONTH_BYTES_UPLOADED;
	public static final ClientProperties<Void> CLIENT_TOTAL_BYTES_DOWNLOADED = ClientPropertiesVoid.CLIENT_TOTAL_BYTES_DOWNLOADED;
	public static final ClientProperties<Void> CLIENT_TOTAL_BYTES_UPLOADED = ClientPropertiesVoid.CLIENT_TOTAL_BYTES_UPLOADED;
	public static final ClientProperties<Void> CLIENT_IS_PRIORITY_SPEAKER = ClientPropertiesVoid.CLIENT_IS_PRIORITY_SPEAKER;
	public static final ClientProperties<Void> CLIENT_UNREAD_MESSAGES = ClientPropertiesVoid.CLIENT_UNREAD_MESSAGES;
	public static final ClientProperties<Void> CLIENT_NICKNAME_PHONETIC = ClientPropertiesVoid.CLIENT_NICKNAME_PHONETIC;
	public static final ClientProperties<Void> CLIENT_NEEDED_SERVERQUERY_VIEW_POWER = ClientPropertiesVoid.CLIENT_NEEDED_SERVERQUERY_VIEW_POWER;
	public static final ClientProperties<Void> CONNECTION_FILETRANSFER_BANDWIDTH_SENT = ClientPropertiesVoid.CONNECTION_FILETRANSFER_BANDWIDTH_SENT;
	public static final ClientProperties<Void> CONNECTION_FILETRANSFER_BANDWIDTH_RECEIVED = ClientPropertiesVoid.CONNECTION_FILETRANSFER_BANDWIDTH_RECEIVED;
	public static final ClientProperties<Void> CONNECTION_PACKETS_SENT_TOTAL = ClientPropertiesVoid.CONNECTION_PACKETS_SENT_TOTAL;
	public static final ClientProperties<Void> CONNECTION_PACKETS_RECEIVED_TOTAL = ClientPropertiesVoid.CONNECTION_PACKETS_RECEIVED_TOTAL;
	public static final ClientProperties<Void> CONNECTION_BANDWIDTH_SENT_LAST_SECOND_TOTAL = ClientPropertiesVoid.CONNECTION_BANDWIDTH_SENT_LAST_SECOND_TOTAL;
	public static final ClientProperties<Void> CONNECTION_BANDWIDTH_RECEIVED_LAST_SECOND_TOTAL = ClientPropertiesVoid.CONNECTION_BANDWIDTH_RECEIVED_LAST_SECOND_TOTAL;
	public static final ClientProperties<Void> CONNECTION_BANDWIDTH_SENT_LAST_MINUTE_TOTAL = ClientPropertiesVoid.CONNECTION_BANDWIDTH_SENT_LAST_MINUTE_TOTAL;
	public static final ClientProperties<Void> CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL = ClientPropertiesVoid.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL;
	public static final ClientProperties<Void> CONNECTION_CLIENT_IP = ClientPropertiesVoid.CONNECTION_CLIENT_IP;
	public static final ClientProperties<Void> CLIENT_COUNTRY = ClientPropertiesVoid.CLIENT_COUNTRY;

	protected ClientProperties(String name, Boolean changeable) {
		super(name, changeable);
	}

}
