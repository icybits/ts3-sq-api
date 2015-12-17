package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * send text message
 * 
 * @author Iceac
 */
public class SendtextmessageCommand extends Command
		implements
			ITS3CommandNames {
	public SendtextmessageCommand() {
		super(COMMAND_SENDTEXTMESSAGE);
	}
}