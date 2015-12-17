package de.icybits.ts3.sq.api.commands;

import java.math.BigInteger;

import de.icybits.ts3.sq.api.basic.Command;
import de.icybits.ts3.sq.api.basic.parameter.ParameterBigIntegerValue;
import de.icybits.ts3.sq.api.basic.parameter.ParameterIntegerValue;
import de.icybits.ts3.sq.api.enums.Permissions;
import de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;
import de.icybits.ts3.sq.api.interfaces.ITS3ServerInstanceProperties;

/**
 * Changes the server instance configuration using given properties. For
 * detailed information, see {@link ITS3ServerInstanceProperties}.
 *
 * @author iceac
 */
public class InstanceeditCommand extends Command
		implements
			ITS3ServerInstanceProperties,
			ITS3CommandNames {

	private static final Permissions[] PERMISSIONS = new Permissions[]{
			Permissions.B_SERVERINSTANCE_MODIFY_SETTINGS};

	/**
	 * Changes the server instance configuration using given properties. For
	 * detailed information, see {@link ITS3ServerInstanceProperties}.
	 */
	public InstanceeditCommand() {
		super(COMMAND_INSTANCEINFO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.icybits.ts3.sq.api.interfaces.ITS3Permission#getPermissions()
	 */
	@Override
	public Permissions[] getPermissions() {
		return PERMISSIONS;
	}

	/**
	 * TCP port used for file transfers
	 * 
	 * @param port
	 *            the TCP port
	 * @return This command
	 */
	public InstanceeditCommand setFiletransferPort(int port) {
		setParameter(new ParameterIntegerValue(SERVERINSTANCE_FILETRANSFER_PORT,
				port));
		return this;
	}

	/**
	 * Default ServerQuery group ID
	 * 
	 * @param groupID
	 *            the default ServerQuery group ID
	 * @return This command
	 */
	public InstanceeditCommand setGuestServerQueryGroup(int groupID) {
		setParameter(new ParameterIntegerValue(
				SERVERINSTANCE_GUEST_SERVERQUERY_GROUP, groupID));
		return this;
	}

	/**
	 * Max bandwidth available for outgoing file transfers (Bytes/s)
	 * 
	 * @param bytes
	 *            the max bandwidth in Bytes/s
	 * @return This command
	 */
	public InstanceeditCommand setMaxDownloadTotalBandwidth(BigInteger bytes) {
		setParameter(new ParameterBigIntegerValue(
				SERVERINSTANCE_MAX_DOWNLOAD_TOTAL_BANDWIDTH, bytes));
		return this;
	}

	/**
	 * Max bandwidth available for incoming file transfers (Bytes/s)
	 * 
	 * @param bytes
	 *            the max bandwidth in Bytes/s
	 * @return This command
	 */
	public InstanceeditCommand setMaxUploadTotalBandwidth(BigInteger bytes) {
		setParameter(new ParameterBigIntegerValue(
				SERVERINSTANCE_MAX_UPLOAD_TOTAL_BANDWIDTH, bytes));
		return this;
	}

	/**
	 * Time in seconds used for automatic bans triggered by the ServerQuery
	 * flood protection
	 * 
	 * @param groupID
	 *            the template ServerAdmin group ID
	 * @return This command
	 */
	public InstanceeditCommand setServerqueryFloodBanTime(int groupID) {
		setParameter(new ParameterIntegerValue(
				SERVERINSTANCE_SERVERQUERY_FLOOD_BAN_TIME, groupID));
		return this;
	}

	/**
	 * Max number of commands allowed in
	 * <SERVERINSTANCE_SERVERQUERY_FLOOD_TIME> seconds
	 * 
	 * @param maxNumber
	 *            the max number of commands allowed
	 * @return This command
	 */
	public InstanceeditCommand setServerqueryFloodCommands(int maxNumber) {
		setParameter(new ParameterIntegerValue(
				SERVERINSTANCE_SERVERQUERY_FLOOD_COMMANDS, maxNumber));
		return this;
	}

	/**
	 * Timeframe in seconds for
	 * <SERVERINSTANCE_SERVERQUERY_FLOOD_COMMANDS> commands
	 * 
	 * @param seconds
	 *            the timeframe in seconds
	 * @return This command
	 */
	public InstanceeditCommand setServerqueryFloodTime(int seconds) {
		setParameter(new ParameterIntegerValue(
				SERVERINSTANCE_SERVERQUERY_FLOOD_TIME, seconds));
		return this;
	}

	/**
	 * Default channel administrator group ID used in templates
	 * 
	 * @param groupID
	 *            the template ChannelAdmin group ID
	 * @return This command
	 */
	public InstanceeditCommand setTemplateChannelAdminGroup(int groupID) {
		setParameter(new ParameterIntegerValue(
				SERVERINSTANCE_TEMPLATE_CHANNELADMIN_GROUP, groupID));
		return this;
	}

	/**
	 * Default channel group ID used in templates
	 * 
	 * @param groupID
	 *            the template Channel Default group ID
	 * @return This command
	 */
	public InstanceeditCommand setTemplateChannelDefaultGroup(int groupID) {
		setParameter(new ParameterIntegerValue(
				SERVERINSTANCE_TEMPLATE_CHANNELDEFAULT_GROUP, groupID));
		return this;
	}

	/**
	 * Default template group ID for administrators on new virtual servers (used
	 * to create initial token)
	 * 
	 * @param groupID
	 *            the template ServerAdmin group ID
	 * @return This command
	 */
	public InstanceeditCommand setTemplateServerAdminGroup(int groupID) {
		setParameter(new ParameterIntegerValue(
				SERVERINSTANCE_TEMPLATE_SERVERADMIN_GROUP, groupID));
		return this;
	}

	/**
	 * Default server group ID used in templates
	 * 
	 * @param groupID
	 *            the template Server Default group ID
	 * @return This command
	 */
	public InstanceeditCommand setTemplateServerdefaultGroup(int groupID) {
		setParameter(new ParameterIntegerValue(
				SERVERINSTANCE_TEMPLATE_SERVERDEFAULT_GROUP, groupID));
		return this;
	}
}
