package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * change channel properties
 * 
 * @author Iceac
 */
public class ChanneleditCommand extends Command implements ITS3CommandNames {
	public ChanneleditCommand() {
		super(COMMAND_CHANNELEDIT);
	}
}