package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * list recent log entries
 * 
 * @author Iceac
 */
public class LogviewCommand extends Command implements ITS3CommandNames {
	public LogviewCommand() {
		super(COMMAND_LOGVIEW);
	}
}