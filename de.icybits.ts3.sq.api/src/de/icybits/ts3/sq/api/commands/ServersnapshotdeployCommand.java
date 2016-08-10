package de.icybits.ts3.sq.api.commands;
import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
/**
 * deploy snapshot of a virtual server
 * 
 * @author Alias: Iceac Sarutobi
 */
public class ServersnapshotdeployCommand extends Command
		implements
			ITS3CommandNames {
	public ServersnapshotdeployCommand() {
		super(COMMAND_SERVERSNAPSHOTDEPLOY);
	}
}