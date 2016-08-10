package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * add custom entry to log
 * 
 * @author Alias: Iceac Sarutobi
 */
public class LogaddCommand extends Command implements ITS3CommandNames {
	public LogaddCommand() {
		super(COMMAND_LOGADD);
	}
}