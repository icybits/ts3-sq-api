package de.icybits.ts3.sq.api.properties;

import de.icybits.ts3.sq.api.enums.VirtualServerStatus;
/**
 * 
 * @author Saali
 *
 */

public class VirtualServerPropertiesVirtualServerStatus extends VirtualServerProperties<VirtualServerStatus> {
	private VirtualServerPropertiesVirtualServerStatus(String name, Boolean changeable) {
		super(name, changeable);
	}

}
