package de.icybits.ts3.sq.api.properties;
/**
 * 
 * @author Saali
 *
 */

public class ChannelPropertiesInteger extends ChannelProperties<Integer> {

	public static final ChannelPropertiesInteger CHANNEL_CODEC_QUALITY = new ChannelPropertiesInteger("CHANNEL_CODEC_QUALITY", true);
	public static final ChannelPropertiesInteger CHANNEL_MAXCLIENTS = new ChannelPropertiesInteger("CHANNEL_MAXCLIENTS", true);
	public static final ChannelPropertiesInteger CHANNEL_MAXFAMILYCLIENTS = new ChannelPropertiesInteger("CHANNEL_MAXFAMILYCLIENTS", true);
	public static final ChannelPropertiesInteger CHANNEL_ORDER = new ChannelPropertiesInteger("CHANNEL_ORDER", true);
	public static final ChannelPropertiesInteger CHANNEL_NEEDED_TALK_POWER = new ChannelPropertiesInteger("CHANNEL_NEEDED_TALK_POWER", true);
	public static final ChannelPropertiesInteger CHANNEL_ICON_ID = new ChannelPropertiesInteger("CHANNEL_ICON_ID", true);
	public static final ChannelPropertiesInteger CPID = new ChannelPropertiesInteger("CPID", true);
	
	private ChannelPropertiesInteger(String name, Boolean changeable) {
		super(name, changeable);
	}

}
