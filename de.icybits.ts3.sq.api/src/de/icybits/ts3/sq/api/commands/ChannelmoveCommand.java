package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * move channel to new parent
 * 
 * @author Iceac
 */
public class ChannelmoveCommand extends Command implements ITS3CommandNames {
	public ChannelmoveCommand() {
		super(COMMAND_CHANNELMOVE);
	}
}