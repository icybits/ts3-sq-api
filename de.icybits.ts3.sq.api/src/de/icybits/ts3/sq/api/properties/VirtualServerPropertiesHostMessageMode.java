package de.icybits.ts3.sq.api.properties;

import de.icybits.ts3.sq.api.interfaces.ITS3Definitions.HostMessageMode;
/**
 * 
 * @author Saali
 *
 */
public class VirtualServerPropertiesHostMessageMode extends VirtualServerProperties<HostMessageMode> {

	public static final VirtualServerPropertiesHostMessageMode VIRTUALSERVER_HOSTMESSAGE_MODE = new VirtualServerPropertiesHostMessageMode("VIRTUALSERVER_HOSTMESSAGE_MODE", true);
	
	private VirtualServerPropertiesHostMessageMode(String name, Boolean changeable) {
		super(name, changeable);
	}

}
