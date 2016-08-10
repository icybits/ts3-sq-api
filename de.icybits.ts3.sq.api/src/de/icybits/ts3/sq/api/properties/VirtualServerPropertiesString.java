package de.icybits.ts3.sq.api.properties;
/**
 * 
 * @author Saali
 *
 */
public class VirtualServerPropertiesString extends VirtualServerProperties<String>{
	
	public static final VirtualServerPropertiesString VIRTUALSERVER_NAME = new VirtualServerPropertiesString("VIRTUALSERVER_NAME", true);
	public static final VirtualServerPropertiesString VIRTUALSERVER_WELCOMEMESSAGE = new VirtualServerPropertiesString("VIRTUALSERVER_WELCOMEMESSAGE", true);
	public static final VirtualServerPropertiesString VIRTUALSERVER_PASSWORD = new VirtualServerPropertiesString("VIRTUALSERVER_PASSWORD", true);
	public static final VirtualServerPropertiesString VIRTUALSERVER_HOSTMESSAGE = new VirtualServerPropertiesString("VIRTUALSERVER_HOSTMESSAGE", true);
	public static final VirtualServerPropertiesString VIRTUALSERVER_HOSTBANNER_URL = new VirtualServerPropertiesString("VIRTUALSERVER_HOSTBANNER_URL", true);
	public static final VirtualServerPropertiesString VIRTUALSERVER_HOSTBANNER_GFX_URL = new VirtualServerPropertiesString("VIRTUALSERVER_HOSTBANNER_GFX_URL", true);
	public static final VirtualServerPropertiesString VIRTUALSERVER_HOSTBUTTON_TOOLTIP = new VirtualServerPropertiesString("VIRTUALSERVER_HOSTBUTTON_TOOLTIP", true);
	public static final VirtualServerPropertiesString VIRTUALSERVER_HOSTBUTTON_GFX_URL = new VirtualServerPropertiesString("VIRTUALSERVER_HOSTBUTTON_GFX_URL", true);
	public static final VirtualServerPropertiesString VIRTUALSERVER_HOSTBUTTON_URL = new VirtualServerPropertiesString("VIRTUALSERVER_HOSTBUTTON_URL", true);
	

	private VirtualServerPropertiesString(String name, Boolean changeable) {
		super(name, changeable);
	}

}
