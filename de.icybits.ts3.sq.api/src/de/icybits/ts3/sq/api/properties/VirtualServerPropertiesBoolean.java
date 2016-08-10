package de.icybits.ts3.sq.api.properties;

public class VirtualServerPropertiesBoolean extends VirtualServerProperties<Boolean> {
	
	public static final VirtualServerPropertiesBoolean VIRTUALSERVER_AUTOSTART = new VirtualServerPropertiesBoolean("VIRTUALSERVER_AUTOSTART", true);

	private VirtualServerPropertiesBoolean(String name, Boolean changeable) {
		super(name, changeable);
	}

}
