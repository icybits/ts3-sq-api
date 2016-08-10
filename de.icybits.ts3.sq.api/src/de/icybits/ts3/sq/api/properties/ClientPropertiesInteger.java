package de.icybits.ts3.sq.api.properties;
/**
 * 
 * @author Saali
 *
 */

public class ClientPropertiesInteger extends ClientProperties<Integer>{
	
	public static final ClientPropertiesInteger CLIENT_ICON_ID = new ClientPropertiesInteger("CLIENT_ICON_ID", true);

	private ClientPropertiesInteger(String name, Boolean changeable) {
		super(name, changeable);
	}

}
