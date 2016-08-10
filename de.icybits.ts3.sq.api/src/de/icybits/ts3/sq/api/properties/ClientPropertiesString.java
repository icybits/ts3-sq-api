package de.icybits.ts3.sq.api.properties;
/**
 * 
 * @author Saali
 *
 */

public class ClientPropertiesString extends ClientProperties<String>{
	
	public static final ClientPropertiesString CLIENT_NICKNAME = new ClientPropertiesString("CLIENT_NICKNAME", true);
	public static final ClientPropertiesString CLIENT_DESCRIPTION = new ClientPropertiesString("CLIENT_DESCRIPTION", true);
	

	private ClientPropertiesString(String name, Boolean changeable) {
		super(name, changeable);
	}

}
