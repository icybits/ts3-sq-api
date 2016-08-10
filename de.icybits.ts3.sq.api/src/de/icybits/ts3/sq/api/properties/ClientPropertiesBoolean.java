package de.icybits.ts3.sq.api.properties;
/**
 * 
 * @author Saali
 *
 */

public class ClientPropertiesBoolean extends ClientProperties<Boolean> {
	
	public static final ClientPropertiesBoolean CLIENT_IS_TALKER = new ClientPropertiesBoolean("CLIENT_IS_TALKER", true);

	private ClientPropertiesBoolean(String name, Boolean changeable) {
		super(name, changeable);
	}

}
