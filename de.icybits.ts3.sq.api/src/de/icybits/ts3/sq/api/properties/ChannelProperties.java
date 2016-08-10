package de.icybits.ts3.sq.api.properties;
/**
 * 
 * @author Saali
 * 
 */

import de.icybits.ts3.sq.api.basic.Properties;
import de.icybits.ts3.sq.api.interfaces.ITS3Definitions.Codec;

public class ChannelProperties<K> extends Properties {
	
	public static final ChannelProperties<Boolean> CHANNEL_FLAG_PERMANENT = ChannelPropertiesBoolean.CHANNEL_FLAG_PERMANENT;
	public static final ChannelProperties<Boolean> CHANNEL_FLAG_SEMI_PERMANENT = ChannelPropertiesBoolean.CHANNEL_FLAG_SEMI_PERMANENT;
	public static final ChannelProperties<Boolean> CHANNEL_FLAG_TEMPORARY = ChannelPropertiesBoolean.CHANNEL_FLAG_TEMPORARY;
	public static final ChannelProperties<Boolean> CHANNEL_FLAG_DEFAULT = ChannelPropertiesBoolean.CHANNEL_FLAG_DEFAULT;
	public static final ChannelProperties<Boolean> CHANNEL_FLAG_MAXCLIENTS_UNLIMITED = ChannelPropertiesBoolean.CHANNEL_FLAG_MAXCLIENTS_UNLIMITED;
	public static final ChannelProperties<Boolean> CHANNEL_FLAG_MAXFAMILYCLIENTS_UNLIMITED = ChannelPropertiesBoolean.CHANNEL_FLAG_MAXFAMILYCLIENTS_UNLIMITED;
	public static final ChannelProperties<Boolean> CHANNEL_FLAG_MAXFAMILYCLIENTS_INHERITED = ChannelPropertiesBoolean.CHANNEL_FLAG_MAXFAMILYCLIENTS_INHERITED;
	public static final ChannelProperties<Boolean> CHANNEL_CODEC_IS_UNENCRYPTED = ChannelPropertiesBoolean.CHANNEL_CODEC_IS_UNENCRYPTED;
	public static final ChannelProperties<Codec> CHANNEL_CODEC = ChannelPropertiesCodec.CHANNEL_CODEC;	
	public static final ChannelProperties<Integer> CHANNEL_CODEC_QUALITY = ChannelPropertiesInteger.CHANNEL_CODEC_QUALITY;
	public static final ChannelProperties<Integer> CHANNEL_MAXCLIENTS = ChannelPropertiesInteger.CHANNEL_MAXCLIENTS;
	public static final ChannelProperties<Integer> CHANNEL_MAXFAMILYCLIENTS = ChannelPropertiesInteger.CHANNEL_MAXCLIENTS;
	public static final ChannelProperties<Integer> CHANNEL_ORDER = ChannelPropertiesInteger.CHANNEL_ORDER;
	public static final ChannelProperties<Integer> CHANNEL_NEEDED_TALK_POWER = ChannelPropertiesInteger.CHANNEL_NEEDED_TALK_POWER;
	public static final ChannelProperties<Integer> CHANNEL_ICON_ID = ChannelPropertiesInteger.CHANNEL_ICON_ID;
	public static final ChannelProperties<Integer> CPID = ChannelPropertiesInteger.CPID;
	public static final ChannelProperties<String> CHANNEL_NAME = ChannelPropertiesString.CHANNEL_NAME;
	public static final ChannelProperties<String> CHANNEL_TOPIC = ChannelPropertiesString.CHANNEL_TOPIC;
	public static final ChannelProperties<String> CHANNEL_DESCRIPTION = ChannelPropertiesString.CHANNEL_DESCRIPTION;
	public static final ChannelProperties<String> CHANNEL_PASSWORD = ChannelPropertiesString.CHANNEL_PASSWORD;
	public static final ChannelProperties<String> CHANNL_NAME_PHONETIC = ChannelPropertiesString.CHANNL_NAME_PHONETIC;
	public static final ChannelProperties<Void> CHANNEL_FLAG_PASSWORD = ChannelPropertiesVoid.CHANNEL_FLAG_PASSWORD;
	public static final ChannelProperties<Void> CHANNEL_FILEPATH = ChannelPropertiesVoid.CHANNEL_FILEPATH;
	public static final ChannelProperties<Void> CHANNEL_FORCED_SILENCE = ChannelPropertiesVoid.CHANNEL_FORCED_SILENCE;
	public static final ChannelProperties<Void> CID = ChannelPropertiesVoid.CID;

	protected ChannelProperties(String name, Boolean changeable) {
		super(name, changeable);
	}
}