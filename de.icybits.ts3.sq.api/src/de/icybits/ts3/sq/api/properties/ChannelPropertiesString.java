package de.icybits.ts3.sq.api.properties;
/**
 * 
 * @author Saali
 *
 */

public class ChannelPropertiesString extends ChannelProperties<String> {
	
	public static final ChannelPropertiesString CHANNEL_NAME = new ChannelPropertiesString("CHANNEL_NAME", true);
	public static final ChannelPropertiesString CHANNEL_TOPIC = new ChannelPropertiesString("CHANNEL_TOPIC", true);
	public static final ChannelPropertiesString CHANNEL_DESCRIPTION = new ChannelPropertiesString("CHANNEL_DESCRIPTION", true);
	public static final ChannelPropertiesString CHANNEL_PASSWORD = new ChannelPropertiesString("CHANNEL_PASSWORD", true);
	public static final ChannelPropertiesString CHANNL_NAME_PHONETIC = new ChannelPropertiesString("CHANNEL_NAME_PHONETIC", true);
	
	private ChannelPropertiesString(String name, Boolean changeable) {
		super(name, changeable);
	}
}
