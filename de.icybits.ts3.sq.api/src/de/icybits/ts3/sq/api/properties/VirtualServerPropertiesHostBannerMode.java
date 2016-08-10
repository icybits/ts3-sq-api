package de.icybits.ts3.sq.api.properties;

import de.icybits.ts3.sq.api.interfaces.ITS3Definitions.HostBannerMode;
/**
 * 
 * @author Saali
 *
 */
public class VirtualServerPropertiesHostBannerMode extends VirtualServerProperties<HostBannerMode> {
	
	public static final VirtualServerPropertiesHostBannerMode VIRTUALSERVER_HOSTBANNER_MODE = new VirtualServerPropertiesHostBannerMode("VIRTUALSERVER_HOSTBANNER_MODE", true);
	
	
	private VirtualServerPropertiesHostBannerMode(String name, Boolean changeable) {
		super(name, changeable);
	}

}
