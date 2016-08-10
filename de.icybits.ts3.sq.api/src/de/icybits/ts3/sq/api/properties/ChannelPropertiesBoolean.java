package de.icybits.ts3.sq.api.properties;
/**
 * 
 * @author Saali
 *
 */

public class ChannelPropertiesBoolean extends ChannelProperties<Boolean> {

	public static final ChannelPropertiesBoolean CHANNEL_FLAG_PERMANENT = new ChannelPropertiesBoolean("CHANNEL_FLAG_PERMANENT", true);
	public static final ChannelPropertiesBoolean CHANNEL_FLAG_SEMI_PERMANENT = new ChannelPropertiesBoolean("CHANNEL_FLAG_SEMI_PERMANENT", true);
	public static final ChannelPropertiesBoolean CHANNEL_FLAG_TEMPORARY = new ChannelPropertiesBoolean("CHANNEL_FLAG_TEMPORARY", true);
	public static final ChannelPropertiesBoolean CHANNEL_FLAG_DEFAULT = new ChannelPropertiesBoolean("CHANNEL_FLAG_DEFAULT", true);
	public static final ChannelPropertiesBoolean CHANNEL_FLAG_MAXCLIENTS_UNLIMITED = new ChannelPropertiesBoolean("CHANNEL_FLAG_MAXCLIENTS_UNLIMITED", true);
	public static final ChannelPropertiesBoolean CHANNEL_FLAG_MAXFAMILYCLIENTS_UNLIMITED = new ChannelPropertiesBoolean("CHANNEL_FLAG_MAXFAMILYCLIENTS_UNLIMITED", true);
	public static final ChannelPropertiesBoolean CHANNEL_FLAG_MAXFAMILYCLIENTS_INHERITED = new ChannelPropertiesBoolean("CHANNEL_FLAG_MAXFAMILYCLIENTS_INHERITED", true);
	public static final ChannelPropertiesBoolean CHANNEL_CODEC_IS_UNENCRYPTED = new ChannelPropertiesBoolean("CHANNEL_CODEC_IS_UNENCRYPTED", true);
	
	private ChannelPropertiesBoolean(String name, Boolean changeable) {
		super(name, changeable);
	}

}
