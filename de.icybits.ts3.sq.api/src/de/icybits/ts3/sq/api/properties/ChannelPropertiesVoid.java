package de.icybits.ts3.sq.api.properties;
/**
 * 
 * @author Saali
 *
 */

public class ChannelPropertiesVoid extends ChannelProperties<Void> {

	public static final ChannelPropertiesVoid CHANNEL_FLAG_PASSWORD = new ChannelPropertiesVoid("CHANNEL_FLAG_PASSWORD", false);
	public static final ChannelPropertiesVoid CHANNEL_FILEPATH = new ChannelPropertiesVoid("CHANNEL_FILEPATH", false);
	public static final ChannelPropertiesVoid CHANNEL_FORCED_SILENCE = new ChannelPropertiesVoid("CHANNEL_FORCED_SILENCE", false);
	public static final ChannelPropertiesVoid CID = new ChannelPropertiesVoid("CID", false);
	
	private ChannelPropertiesVoid(String name, Boolean changeable) {
		super(name, changeable);
	}

}
