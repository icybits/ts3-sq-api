package de.icybits.ts3.sq.api.properties;
/**
 * 
 * @author Saali
 * 
 */

import de.icybits.ts3.sq.api.interfaces.ITS3Definitions.Codec;

public class ChannelPropertiesCodec extends ChannelProperties<Codec>{
	
	public static final ChannelPropertiesCodec CHANNEL_CODEC = new ChannelPropertiesCodec("CHANNEL_CODEC", true);

	private ChannelPropertiesCodec(String name, Boolean changeable) {
		super(name, changeable);
	}

}
