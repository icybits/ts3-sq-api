package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * stop a file transfer
 * 
 * @author Alias: Iceac Sarutobi
 */
public class FtstopCommand extends Command implements ITS3CommandNames {
	public FtstopCommand() {
		super(COMMAND_FTSTOP);
	}
}